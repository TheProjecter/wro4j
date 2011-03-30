/*
 * Copyright (c) 2009. All rights reserved.
 */
package ro.isdc.wro.model.resource.processor;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;

import ro.isdc.wro.config.Context;
import ro.isdc.wro.model.resource.processor.impl.css.CssImportPreProcessor;
import ro.isdc.wro.util.WroTestUtils;


/**
 * Test for css import processor.
 *
 * @author Alex Objelean
 */
public class TestCssImportPreProcessor {
  private ResourcePreProcessor processor;

  @Before
  public void setUp() {
    Context.set(Context.standaloneContext());
    processor = new CssImportPreProcessor();
    WroTestUtils.initProcessor(processor);
  }

  @Test
  public void testFromFolder() throws IOException {
    final URL url = getClass().getResource("cssImport");
    final File sourceFolder = new File(url.getFile());
    WroTestUtils.compareSameFolderByExtension(sourceFolder, "css", "out.css", processor);
  }
}
