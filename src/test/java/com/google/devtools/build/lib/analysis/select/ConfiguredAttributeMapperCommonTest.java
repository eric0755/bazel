// Copyright 2015 Google Inc. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.devtools.build.lib.analysis.select;

import com.google.common.collect.ImmutableSet;
import com.google.devtools.build.lib.analysis.ConfiguredAttributeMapper;
import com.google.devtools.build.lib.analysis.config.ConfigMatchingProvider;
import com.google.devtools.build.lib.packages.AbstractAttributeMapper;

/**
 * Tests that {@link ConfiguredAttributeMapper} fulfills all behavior expected
 * of {@link AbstractAttributeMapper}.
 *
 * <p>This is distinct from {@link
 * com.google.devtools.build.lib.analysis.ConfiguredAttributeMapperTest} because the latter needs to
 * inherit from {@link com.google.devtools.build.lib.analysis.util.BuildViewTestCase} to run tests
 * with build configurations.
 */
public class ConfiguredAttributeMapperCommonTest extends AbstractAttributeMapperTest {
  @Override
  public void setUp() throws Exception {
    super.setUp();
    mapper = ConfiguredAttributeMapper.of(rule, ImmutableSet.<ConfigMatchingProvider>of());
  }
}