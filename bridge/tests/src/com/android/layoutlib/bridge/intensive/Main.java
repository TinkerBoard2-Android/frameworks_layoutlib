/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.layoutlib.bridge.intensive;

import com.android.layoutlib.bridge.BridgeRenderSessionTest;
import com.android.layoutlib.bridge.TestDelegates;
import com.android.layoutlib.bridge.android.BridgeContextTest;
import com.android.layoutlib.bridge.android.BridgeXmlBlockParserTest;
import com.android.layoutlib.bridge.impl.LayoutParserWrapperTest;
import com.android.layoutlib.bridge.impl.ResourceHelperTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import android.app.SystemServiceRegistry_AccessorTest;
import android.content.res.Resources_DelegateTest;
import android.graphics.Color_DelegateTest;
import android.graphics.Matrix_DelegateTest;
import android.util.BridgeXmlPullAttributesTest;

/**
 * Suite used by the layoutlib build system
 */
@RunWith(Suite.class)
@SuiteClasses({
        RenderTests.class, LayoutParserWrapperTest.class,
        BridgeXmlBlockParserTest.class, BridgeXmlPullAttributesTest.class,
        Matrix_DelegateTest.class, TestDelegates.class,
        BridgeRenderSessionTest.class, ResourceHelperTest.class, BridgeContextTest.class,
        SystemServiceRegistry_AccessorTest.class, Resources_DelegateTest.class,
        Color_DelegateTest.class,
})
public class Main {
}
