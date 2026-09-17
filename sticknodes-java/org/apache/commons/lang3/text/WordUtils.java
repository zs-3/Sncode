package org.apache.commons.lang3.text;

@java.lang.Deprecated
/* loaded from: classes2.dex */
public class WordUtils {
    public WordUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String capitalize(java.lang.String r1) {
            r0 = 0
            java.lang.String r1 = capitalize(r1, r0)
            return r1
    }

    public static java.lang.String capitalize(java.lang.String r6, char... r7) {
            if (r7 != 0) goto L4
            r0 = -1
            goto L5
        L4:
            int r0 = r7.length
        L5:
            boolean r1 = org.apache.commons.lang3.StringUtils.isEmpty(r6)
            if (r1 != 0) goto L35
            if (r0 != 0) goto Le
            goto L35
        Le:
            char[] r6 = r6.toCharArray()
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = 1
        L16:
            int r4 = r6.length
            if (r2 >= r4) goto L2f
            char r4 = r6[r2]
            boolean r5 = isDelimiter(r4, r7)
            if (r5 == 0) goto L23
            r3 = 1
            goto L2c
        L23:
            if (r3 == 0) goto L2c
            char r3 = java.lang.Character.toTitleCase(r4)
            r6[r2] = r3
            r3 = 0
        L2c:
            int r2 = r2 + 1
            goto L16
        L2f:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            return r7
        L35:
            return r6
    }

    public static java.lang.String capitalizeFully(java.lang.String r1) {
            r0 = 0
            java.lang.String r1 = capitalizeFully(r1, r0)
            return r1
    }

    public static java.lang.String capitalizeFully(java.lang.String r2, char... r3) {
            if (r3 != 0) goto L4
            r0 = -1
            goto L5
        L4:
            int r0 = r3.length
        L5:
            boolean r1 = org.apache.commons.lang3.StringUtils.isEmpty(r2)
            if (r1 != 0) goto L16
            if (r0 != 0) goto Le
            goto L16
        Le:
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r2 = capitalize(r2, r3)
        L16:
            return r2
    }

    public static boolean containsAllWords(java.lang.CharSequence r6, java.lang.CharSequence... r7) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r6)
            r1 = 0
            if (r0 != 0) goto L45
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r7)
            if (r0 == 0) goto Le
            goto L45
        Le:
            int r0 = r7.length
            r2 = 0
        L10:
            if (r2 >= r0) goto L43
            r3 = r7[r2]
            boolean r4 = org.apache.commons.lang3.StringUtils.isBlank(r3)
            if (r4 == 0) goto L1b
            return r1
        L1b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ".*\\b"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = "\\b.*"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r3 = r3.matcher(r6)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L40
            return r1
        L40:
            int r2 = r2 + 1
            goto L10
        L43:
            r6 = 1
            return r6
        L45:
            return r1
    }

    public static java.lang.String initials(java.lang.String r1) {
            r0 = 0
            java.lang.String r1 = initials(r1, r0)
            return r1
    }

    public static java.lang.String initials(java.lang.String r9, char... r10) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r9)
            if (r0 == 0) goto L7
            return r9
        L7:
            if (r10 == 0) goto Lf
            int r0 = r10.length
            if (r0 != 0) goto Lf
            java.lang.String r9 = ""
            return r9
        Lf:
            int r0 = r9.length()
            int r1 = r0 / 2
            r2 = 1
            int r1 = r1 + r2
            char[] r1 = new char[r1]
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
        L1d:
            if (r4 >= r0) goto L36
            char r7 = r9.charAt(r4)
            boolean r8 = isDelimiter(r7, r10)
            if (r8 == 0) goto L2b
            r6 = 1
            goto L33
        L2b:
            if (r6 == 0) goto L33
            int r6 = r5 + 1
            r1[r5] = r7
            r5 = r6
            r6 = 0
        L33:
            int r4 = r4 + 1
            goto L1d
        L36:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r1, r3, r5)
            return r9
    }

    private static boolean isDelimiter(char r4, char[] r5) {
            if (r5 != 0) goto L7
            boolean r4 = java.lang.Character.isWhitespace(r4)
            return r4
        L7:
            int r0 = r5.length
            r1 = 0
            r2 = 0
        La:
            if (r2 >= r0) goto L15
            char r3 = r5[r2]
            if (r4 != r3) goto L12
            r4 = 1
            return r4
        L12:
            int r2 = r2 + 1
            goto La
        L15:
            return r1
    }

    public static java.lang.String swapCase(java.lang.String r5) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r5)
            if (r0 == 0) goto L7
            return r5
        L7:
            char[] r5 = r5.toCharArray()
            r0 = 1
            r1 = 0
            r2 = 0
        Le:
            int r3 = r5.length
            if (r2 >= r3) goto L4b
            char r3 = r5[r2]
            boolean r4 = java.lang.Character.isUpperCase(r3)
            if (r4 == 0) goto L21
            char r0 = java.lang.Character.toLowerCase(r3)
            r5[r2] = r0
        L1f:
            r0 = 0
            goto L48
        L21:
            boolean r4 = java.lang.Character.isTitleCase(r3)
            if (r4 == 0) goto L2e
            char r0 = java.lang.Character.toLowerCase(r3)
            r5[r2] = r0
            goto L1f
        L2e:
            boolean r4 = java.lang.Character.isLowerCase(r3)
            if (r4 == 0) goto L44
            if (r0 == 0) goto L3d
            char r0 = java.lang.Character.toTitleCase(r3)
            r5[r2] = r0
            goto L1f
        L3d:
            char r3 = java.lang.Character.toUpperCase(r3)
            r5[r2] = r3
            goto L48
        L44:
            boolean r0 = java.lang.Character.isWhitespace(r3)
        L48:
            int r2 = r2 + 1
            goto Le
        L4b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            return r0
    }

    public static java.lang.String uncapitalize(java.lang.String r1) {
            r0 = 0
            java.lang.String r1 = uncapitalize(r1, r0)
            return r1
    }

    public static java.lang.String uncapitalize(java.lang.String r6, char... r7) {
            if (r7 != 0) goto L4
            r0 = -1
            goto L5
        L4:
            int r0 = r7.length
        L5:
            boolean r1 = org.apache.commons.lang3.StringUtils.isEmpty(r6)
            if (r1 != 0) goto L35
            if (r0 != 0) goto Le
            goto L35
        Le:
            char[] r6 = r6.toCharArray()
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = 1
        L16:
            int r4 = r6.length
            if (r2 >= r4) goto L2f
            char r4 = r6[r2]
            boolean r5 = isDelimiter(r4, r7)
            if (r5 == 0) goto L23
            r3 = 1
            goto L2c
        L23:
            if (r3 == 0) goto L2c
            char r3 = java.lang.Character.toLowerCase(r4)
            r6[r2] = r3
            r3 = 0
        L2c:
            int r2 = r2 + 1
            goto L16
        L2f:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            return r7
        L35:
            return r6
    }

    public static java.lang.String wrap(java.lang.String r2, int r3) {
            r0 = 0
            r1 = 0
            java.lang.String r2 = wrap(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String wrap(java.lang.String r1, int r2, java.lang.String r3, boolean r4) {
            java.lang.String r0 = " "
            java.lang.String r1 = wrap(r1, r2, r3, r4, r0)
            return r1
    }

    public static java.lang.String wrap(java.lang.String r11, int r12, java.lang.String r13, boolean r14, java.lang.String r15) {
            if (r11 != 0) goto L4
            r11 = 0
            return r11
        L4:
            if (r13 != 0) goto La
            java.lang.String r13 = java.lang.System.lineSeparator()
        La:
            r0 = 1
            if (r12 >= r0) goto Le
            r12 = 1
        Le:
            boolean r0 = org.apache.commons.lang3.StringUtils.isBlank(r15)
            if (r0 == 0) goto L16
            java.lang.String r15 = " "
        L16:
            java.util.regex.Pattern r15 = java.util.regex.Pattern.compile(r15)
            int r0 = r11.length()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0 + 32
            r2.<init>(r3)
        L26:
            if (r1 >= r0) goto La8
            r3 = -1
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = r1 + r12
            long r7 = (long) r6
            r9 = 1
            long r7 = r7 + r9
            long r4 = java.lang.Math.min(r4, r7)
            int r5 = (int) r4
            int r4 = java.lang.Math.min(r5, r0)
            java.lang.String r4 = r11.substring(r1, r4)
            java.util.regex.Matcher r4 = r15.matcher(r4)
            boolean r5 = r4.find()
            if (r5 == 0) goto L5a
            int r3 = r4.start()
            if (r3 != 0) goto L55
            int r3 = r4.end()
            int r1 = r1 + r3
            goto L26
        L55:
            int r3 = r4.start()
            int r3 = r3 + r1
        L5a:
            int r5 = r0 - r1
            if (r5 > r12) goto L5f
            goto La8
        L5f:
            boolean r5 = r4.find()
            if (r5 == 0) goto L6b
            int r3 = r4.start()
            int r3 = r3 + r1
            goto L5f
        L6b:
            if (r3 < r1) goto L77
            r2.append(r11, r1, r3)
            r2.append(r13)
        L73:
            int r3 = r3 + 1
            r1 = r3
            goto L26
        L77:
            if (r14 == 0) goto L81
            r2.append(r11, r1, r6)
            r2.append(r13)
            r1 = r6
            goto L26
        L81:
            java.lang.String r4 = r11.substring(r6)
            java.util.regex.Matcher r4 = r15.matcher(r4)
            boolean r5 = r4.find()
            if (r5 == 0) goto L95
            int r3 = r4.start()
            int r3 = r3 + r1
            int r3 = r3 + r12
        L95:
            if (r3 < 0) goto L9e
            r2.append(r11, r1, r3)
            r2.append(r13)
            goto L73
        L9e:
            int r3 = r11.length()
            r2.append(r11, r1, r3)
            r1 = r0
            goto L26
        La8:
            int r12 = r11.length()
            r2.append(r11, r1, r12)
            java.lang.String r11 = r2.toString()
            return r11
    }
}
