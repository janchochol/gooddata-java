/*
 * Copyright (C) 2004-2017, GoodData(R) Corporation. All rights reserved.
 * This source code is licensed under the BSD-style license found in the
 * LICENSE.txt file in the root directory of this source tree.
 */
package com.gooddata.export;

import java.util.stream.Stream;

/**
 * Format of exported report
 */
public enum ExportFormat {

    PDF, XLS, PNG, CSV, HTML, XLSX;

    public String getValue() {
        return name().toLowerCase();
    }

    public static String[] arrayToStringArray(final ExportFormat... formats) {
        return Stream.of(formats)
                .map(ExportFormat::getValue)
                .toArray(String[]::new);
    }
}
