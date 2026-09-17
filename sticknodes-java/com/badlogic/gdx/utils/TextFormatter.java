package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
class TextFormatter {
    private com.badlogic.gdx.utils.StringBuilder buffer;
    private java.text.MessageFormat messageFormat;

    public TextFormatter(java.util.Locale r2, boolean r3) {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.utils.StringBuilder r0 = new com.badlogic.gdx.utils.StringBuilder
            r0.<init>()
            r1.buffer = r0
            if (r3 == 0) goto L15
            java.text.MessageFormat r3 = new java.text.MessageFormat
            java.lang.String r0 = ""
            r3.<init>(r0, r2)
            r1.messageFormat = r3
        L15:
            return
    }

    private java.lang.String replaceEscapeChars(java.lang.String r9) {
            r8 = this;
            com.badlogic.gdx.utils.StringBuilder r0 = r8.buffer
            r1 = 0
            r0.setLength(r1)
            int r0 = r9.length()
            r2 = 0
        Lb:
            if (r1 >= r0) goto L5d
            char r3 = r9.charAt(r1)
            r4 = 39
            r5 = 1
            if (r3 != r4) goto L1f
            com.badlogic.gdx.utils.StringBuilder r2 = r8.buffer
            java.lang.String r3 = "''"
            r2.append(r3)
            r2 = 1
            goto L5b
        L1f:
            r6 = 123(0x7b, float:1.72E-43)
            if (r3 != r6) goto L56
            int r3 = r1 + 1
        L25:
            if (r3 >= r0) goto L30
            char r7 = r9.charAt(r3)
            if (r7 != r6) goto L30
            int r3 = r3 + 1
            goto L25
        L30:
            int r1 = r3 - r1
            int r7 = r1 / 2
            if (r7 <= 0) goto L4a
            com.badlogic.gdx.utils.StringBuilder r2 = r8.buffer
            r2.append(r4)
        L3b:
            com.badlogic.gdx.utils.StringBuilder r2 = r8.buffer
            r2.append(r6)
            int r7 = r7 + (-1)
            if (r7 > 0) goto L3b
            com.badlogic.gdx.utils.StringBuilder r2 = r8.buffer
            r2.append(r4)
            r2 = 1
        L4a:
            int r1 = r1 % 2
            if (r1 == 0) goto L53
            com.badlogic.gdx.utils.StringBuilder r1 = r8.buffer
            r1.append(r6)
        L53:
            int r1 = r3 + (-1)
            goto L5b
        L56:
            com.badlogic.gdx.utils.StringBuilder r4 = r8.buffer
            r4.append(r3)
        L5b:
            int r1 = r1 + r5
            goto Lb
        L5d:
            if (r2 == 0) goto L65
            com.badlogic.gdx.utils.StringBuilder r9 = r8.buffer
            java.lang.String r9 = r9.toString()
        L65:
            return r9
    }

    private java.lang.String simpleFormat(java.lang.String r11, java.lang.Object... r12) {
            r10 = this;
            com.badlogic.gdx.utils.StringBuilder r0 = r10.buffer
            r1 = 0
            r0.setLength(r1)
            int r0 = r11.length()
            r2 = -1
            r3 = 0
            r4 = -1
            r5 = 0
        Le:
            if (r3 >= r0) goto La7
            char r6 = r11.charAt(r3)
            r7 = 123(0x7b, float:1.72E-43)
            r8 = 1
            if (r4 >= 0) goto L35
            if (r6 != r7) goto L2f
            int r5 = r3 + 1
            if (r5 >= r0) goto L2c
            char r9 = r11.charAt(r5)
            if (r9 != r7) goto L2c
            com.badlogic.gdx.utils.StringBuilder r3 = r10.buffer
            r3.append(r6)
            r3 = r5
            goto L2d
        L2c:
            r4 = 0
        L2d:
            r5 = 1
            goto L89
        L2f:
            com.badlogic.gdx.utils.StringBuilder r7 = r10.buffer
            r7.append(r6)
            goto L89
        L35:
            r9 = 125(0x7d, float:1.75E-43)
            if (r6 != r9) goto L7c
            int r6 = r12.length
            if (r4 >= r6) goto L65
            int r6 = r3 + (-1)
            char r6 = r11.charAt(r6)
            if (r6 == r7) goto L5d
            r6 = r12[r4]
            if (r6 != 0) goto L50
            com.badlogic.gdx.utils.StringBuilder r4 = r10.buffer
            java.lang.String r6 = "null"
            r4.append(r6)
            goto L5b
        L50:
            com.badlogic.gdx.utils.StringBuilder r6 = r10.buffer
            r4 = r12[r4]
            java.lang.String r4 = r4.toString()
            r6.append(r4)
        L5b:
            r4 = -1
            goto L89
        L5d:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Missing argument index after a left curly brace"
            r11.<init>(r12)
            throw r11
        L65:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Argument index out of bounds: "
            r12.append(r0)
            r12.append(r4)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L7c:
            r7 = 48
            if (r6 < r7) goto L8b
            r7 = 57
            if (r6 > r7) goto L8b
            int r4 = r4 * 10
            int r6 = r6 + (-48)
            int r4 = r4 + r6
        L89:
            int r3 = r3 + r8
            goto Le
        L8b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Unexpected '"
            r12.append(r0)
            r12.append(r6)
            java.lang.String r0 = "' while parsing argument index"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        La7:
            if (r4 >= 0) goto Lb2
            if (r5 == 0) goto Lb1
            com.badlogic.gdx.utils.StringBuilder r11 = r10.buffer
            java.lang.String r11 = r11.toString()
        Lb1:
            return r11
        Lb2:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Unmatched braces in the pattern."
            r11.<init>(r12)
            throw r11
    }

    public java.lang.String format(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            java.text.MessageFormat r0 = r1.messageFormat
            if (r0 == 0) goto L12
            java.lang.String r2 = r1.replaceEscapeChars(r2)
            r0.applyPattern(r2)
            java.text.MessageFormat r2 = r1.messageFormat
            java.lang.String r2 = r2.format(r3)
            return r2
        L12:
            java.lang.String r2 = r1.simpleFormat(r2, r3)
            return r2
    }
}
