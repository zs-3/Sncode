package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public class StringUtils {
    public static final java.lang.String CR = "\r";
    public static final java.lang.String EMPTY = "";
    public static final int INDEX_NOT_FOUND = -1;
    public static final java.lang.String LF = "\n";
    private static final int PAD_LIMIT = 8192;
    public static final java.lang.String SPACE = " ";
    private static final int STRING_BUILDER_SIZE = 256;

    public StringUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String abbreviate(java.lang.String r2, int r3) {
            java.lang.String r0 = "..."
            r1 = 0
            java.lang.String r2 = abbreviate(r2, r0, r1, r3)
            return r2
    }

    public static java.lang.String abbreviate(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "..."
            java.lang.String r1 = abbreviate(r1, r0, r2, r3)
            return r1
    }

    public static java.lang.String abbreviate(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = 0
            java.lang.String r1 = abbreviate(r1, r2, r0, r3)
            return r1
    }

    public static java.lang.String abbreviate(java.lang.String r7, java.lang.String r8, int r9, int r10) {
            boolean r0 = isEmpty(r7)
            if (r0 != 0) goto Lb3
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto Le
            goto Lb3
        Le:
            int r0 = r8.length()
            int r1 = r0 + 1
            int r2 = r0 + r0
            r3 = 1
            int r2 = r2 + r3
            r4 = 0
            if (r10 < r1) goto L9f
            int r5 = r7.length()
            if (r5 > r10) goto L22
            return r7
        L22:
            int r5 = r7.length()
            if (r9 <= r5) goto L2c
            int r9 = r7.length()
        L2c:
            int r5 = r7.length()
            int r5 = r5 - r9
            int r6 = r10 - r0
            if (r5 >= r6) goto L3a
            int r9 = r7.length()
            int r9 = r9 - r6
        L3a:
            if (r9 > r1) goto L50
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r7 = r7.substring(r4, r6)
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            return r7
        L50:
            if (r10 < r2) goto L8b
            int r10 = r10 + r9
            int r10 = r10 - r0
            int r0 = r7.length()
            if (r10 >= r0) goto L72
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            java.lang.String r7 = r7.substring(r9)
            java.lang.String r7 = abbreviate(r7, r8, r6)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            return r7
        L72:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            int r8 = r7.length()
            int r8 = r8 - r6
            java.lang.String r7 = r7.substring(r8)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            return r7
        L8b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r8[r4] = r9
            java.lang.String r9 = "Minimum abbreviation width with offset is %d"
            java.lang.String r8 = java.lang.String.format(r9, r8)
            r7.<init>(r8)
            throw r7
        L9f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r8[r4] = r9
            java.lang.String r9 = "Minimum abbreviation width is %d"
            java.lang.String r8 = java.lang.String.format(r9, r8)
            r7.<init>(r8)
            throw r7
        Lb3:
            return r7
    }

    public static java.lang.String abbreviateMiddle(java.lang.String r3, java.lang.String r4, int r5) {
            boolean r0 = isEmpty(r3)
            if (r0 != 0) goto L46
            boolean r0 = isEmpty(r4)
            if (r0 == 0) goto Ld
            goto L46
        Ld:
            int r0 = r3.length()
            if (r5 >= r0) goto L46
            int r0 = r4.length()
            int r0 = r0 + 2
            if (r5 >= r0) goto L1c
            goto L46
        L1c:
            int r0 = r4.length()
            int r5 = r5 - r0
            int r0 = r5 / 2
            int r5 = r5 % 2
            int r5 = r5 + r0
            int r1 = r3.length()
            int r1 = r1 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
            java.lang.String r5 = r3.substring(r2, r5)
            r0.append(r5)
            r0.append(r4)
            java.lang.String r3 = r3.substring(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L46:
            return r3
    }

    private static java.lang.String appendIfMissing(java.lang.String r3, java.lang.CharSequence r4, boolean r5, java.lang.CharSequence... r6) {
            if (r3 == 0) goto L37
            boolean r0 = isEmpty(r4)
            if (r0 != 0) goto L37
            boolean r0 = endsWith(r3, r4, r5)
            if (r0 == 0) goto Lf
            goto L37
        Lf:
            if (r6 == 0) goto L24
            int r0 = r6.length
            if (r0 <= 0) goto L24
            int r0 = r6.length
            r1 = 0
        L16:
            if (r1 >= r0) goto L24
            r2 = r6[r1]
            boolean r2 = endsWith(r3, r2, r5)
            if (r2 == 0) goto L21
            return r3
        L21:
            int r1 = r1 + 1
            goto L16
        L24:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = r4.toString()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L37:
            return r3
    }

    public static java.lang.String appendIfMissing(java.lang.String r1, java.lang.CharSequence r2, java.lang.CharSequence... r3) {
            r0 = 0
            java.lang.String r1 = appendIfMissing(r1, r2, r0, r3)
            return r1
    }

    public static java.lang.String appendIfMissingIgnoreCase(java.lang.String r1, java.lang.CharSequence r2, java.lang.CharSequence... r3) {
            r0 = 1
            java.lang.String r1 = appendIfMissing(r1, r2, r0, r3)
            return r1
    }

    public static java.lang.String capitalize(java.lang.String r7) {
            if (r7 == 0) goto L34
            int r0 = r7.length()
            if (r0 != 0) goto L9
            goto L34
        L9:
            r1 = 0
            int r2 = r7.codePointAt(r1)
            int r3 = java.lang.Character.toTitleCase(r2)
            if (r2 != r3) goto L15
            return r7
        L15:
            int[] r4 = new int[r0]
            r4[r1] = r3
            int r2 = java.lang.Character.charCount(r2)
            r3 = 1
        L1e:
            if (r2 >= r0) goto L2f
            int r5 = r7.codePointAt(r2)
            int r6 = r3 + 1
            r4[r3] = r5
            int r3 = java.lang.Character.charCount(r5)
            int r2 = r2 + r3
            r3 = r6
            goto L1e
        L2f:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r4, r1, r3)
        L34:
            return r7
    }

    public static java.lang.String center(java.lang.String r1, int r2) {
            r0 = 32
            java.lang.String r1 = center(r1, r2, r0)
            return r1
    }

    public static java.lang.String center(java.lang.String r2, int r3, char r4) {
            if (r2 == 0) goto L19
            if (r3 > 0) goto L5
            goto L19
        L5:
            int r0 = r2.length()
            int r1 = r3 - r0
            if (r1 > 0) goto Le
            return r2
        Le:
            int r1 = r1 / 2
            int r0 = r0 + r1
            java.lang.String r2 = leftPad(r2, r0, r4)
            java.lang.String r2 = rightPad(r2, r3, r4)
        L19:
            return r2
    }

    public static java.lang.String center(java.lang.String r2, int r3, java.lang.String r4) {
            if (r2 == 0) goto L21
            if (r3 > 0) goto L5
            goto L21
        L5:
            boolean r0 = isEmpty(r4)
            if (r0 == 0) goto Ld
            java.lang.String r4 = " "
        Ld:
            int r0 = r2.length()
            int r1 = r3 - r0
            if (r1 > 0) goto L16
            return r2
        L16:
            int r1 = r1 / 2
            int r0 = r0 + r1
            java.lang.String r2 = leftPad(r2, r0, r4)
            java.lang.String r2 = rightPad(r2, r3, r4)
        L21:
            return r2
    }

    public static java.lang.String chomp(java.lang.String r5) {
            boolean r0 = isEmpty(r5)
            if (r0 == 0) goto L7
            return r5
        L7:
            int r0 = r5.length()
            r1 = 0
            r2 = 10
            r3 = 13
            r4 = 1
            if (r0 != r4) goto L20
            char r0 = r5.charAt(r1)
            if (r0 == r3) goto L1d
            if (r0 != r2) goto L1c
            goto L1d
        L1c:
            return r5
        L1d:
            java.lang.String r5 = ""
            return r5
        L20:
            int r0 = r5.length()
            int r0 = r0 - r4
            char r4 = r5.charAt(r0)
            if (r4 != r2) goto L36
            int r2 = r0 + (-1)
            char r2 = r5.charAt(r2)
            if (r2 != r3) goto L3a
            int r0 = r0 + (-1)
            goto L3a
        L36:
            if (r4 == r3) goto L3a
            int r0 = r0 + 1
        L3a:
            java.lang.String r5 = r5.substring(r1, r0)
            return r5
    }

    @java.lang.Deprecated
    public static java.lang.String chomp(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = removeEnd(r0, r1)
            return r0
    }

    public static java.lang.String chop(java.lang.String r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.length()
            r1 = 2
            if (r0 >= r1) goto Le
            java.lang.String r4 = ""
            return r4
        Le:
            int r0 = r0 + (-1)
            r1 = 0
            java.lang.String r2 = r4.substring(r1, r0)
            char r4 = r4.charAt(r0)
            r3 = 10
            if (r4 != r3) goto L2c
            int r0 = r0 + (-1)
            char r4 = r2.charAt(r0)
            r3 = 13
            if (r4 != r3) goto L2c
            java.lang.String r4 = r2.substring(r1, r0)
            return r4
        L2c:
            return r2
    }

    public static int compare(java.lang.String r1, java.lang.String r2) {
            r0 = 1
            int r1 = compare(r1, r2, r0)
            return r1
    }

    public static int compare(java.lang.String r2, java.lang.String r3, boolean r4) {
            if (r2 != r3) goto L4
            r2 = 0
            return r2
        L4:
            r0 = -1
            r1 = 1
            if (r2 != 0) goto Ld
            if (r4 == 0) goto Lb
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
        Ld:
            if (r3 != 0) goto L13
            if (r4 == 0) goto L12
            r0 = 1
        L12:
            return r0
        L13:
            int r2 = r2.compareTo(r3)
            return r2
    }

    public static int compareIgnoreCase(java.lang.String r1, java.lang.String r2) {
            r0 = 1
            int r1 = compareIgnoreCase(r1, r2, r0)
            return r1
    }

    public static int compareIgnoreCase(java.lang.String r2, java.lang.String r3, boolean r4) {
            if (r2 != r3) goto L4
            r2 = 0
            return r2
        L4:
            r0 = -1
            r1 = 1
            if (r2 != 0) goto Ld
            if (r4 == 0) goto Lb
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
        Ld:
            if (r3 != 0) goto L13
            if (r4 == 0) goto L12
            r0 = 1
        L12:
            return r0
        L13:
            int r2 = r2.compareToIgnoreCase(r3)
            return r2
    }

    public static boolean contains(java.lang.CharSequence r2, int r3) {
            boolean r0 = isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r2 = org.apache.commons.lang3.CharSequenceUtils.indexOf(r2, r3, r1)
            if (r2 < 0) goto Lf
            r1 = 1
        Lf:
            return r1
    }

    public static boolean contains(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = 0
            if (r1 == 0) goto Ld
            if (r2 != 0) goto L6
            goto Ld
        L6:
            int r1 = org.apache.commons.lang3.CharSequenceUtils.indexOf(r1, r2, r0)
            if (r1 < 0) goto Ld
            r0 = 1
        Ld:
            return r0
    }

    public static boolean containsAny(java.lang.CharSequence r0, java.lang.CharSequence r1) {
            if (r1 != 0) goto L4
            r0 = 0
            return r0
        L4:
            char[] r1 = org.apache.commons.lang3.CharSequenceUtils.toCharArray(r1)
            boolean r0 = containsAny(r0, r1)
            return r0
    }

    public static boolean containsAny(java.lang.CharSequence r11, char... r12) {
            boolean r0 = isEmpty(r11)
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r12)
            if (r0 == 0) goto Le
            goto L44
        Le:
            int r0 = r11.length()
            int r2 = r12.length
            int r3 = r0 + (-1)
            int r4 = r2 + (-1)
            r5 = 0
        L18:
            if (r5 >= r0) goto L44
            char r6 = r11.charAt(r5)
            r7 = 0
        L1f:
            if (r7 >= r2) goto L41
            char r8 = r12[r7]
            if (r8 != r6) goto L3e
            boolean r8 = java.lang.Character.isHighSurrogate(r6)
            r9 = 1
            if (r8 == 0) goto L3d
            if (r7 != r4) goto L2f
            return r9
        L2f:
            if (r5 >= r3) goto L3e
            int r8 = r7 + 1
            char r8 = r12[r8]
            int r10 = r5 + 1
            char r10 = r11.charAt(r10)
            if (r8 != r10) goto L3e
        L3d:
            return r9
        L3e:
            int r7 = r7 + 1
            goto L1f
        L41:
            int r5 = r5 + 1
            goto L18
        L44:
            return r1
    }

    public static boolean containsAny(java.lang.CharSequence r4, java.lang.CharSequence... r5) {
            boolean r0 = isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L1f
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r5)
            if (r0 == 0) goto Le
            goto L1f
        Le:
            int r0 = r5.length
            r2 = 0
        L10:
            if (r2 >= r0) goto L1f
            r3 = r5[r2]
            boolean r3 = contains(r4, r3)
            if (r3 == 0) goto L1c
            r4 = 1
            return r4
        L1c:
            int r2 = r2 + 1
            goto L10
        L1f:
            return r1
    }

    public static boolean containsIgnoreCase(java.lang.CharSequence r10, java.lang.CharSequence r11) {
            r0 = 0
            if (r10 == 0) goto L24
            if (r11 != 0) goto L6
            goto L24
        L6:
            int r7 = r11.length()
            int r1 = r10.length()
            int r8 = r1 - r7
            r9 = 0
        L11:
            if (r9 > r8) goto L24
            r2 = 1
            r5 = 0
            r1 = r10
            r3 = r9
            r4 = r11
            r6 = r7
            boolean r1 = org.apache.commons.lang3.CharSequenceUtils.regionMatches(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            r10 = 1
            return r10
        L21:
            int r9 = r9 + 1
            goto L11
        L24:
            return r0
    }

    public static boolean containsNone(java.lang.CharSequence r0, java.lang.String r1) {
            if (r0 == 0) goto Le
            if (r1 != 0) goto L5
            goto Le
        L5:
            char[] r1 = r1.toCharArray()
            boolean r0 = containsNone(r0, r1)
            return r0
        Le:
            r0 = 1
            return r0
    }

    public static boolean containsNone(java.lang.CharSequence r11, char... r12) {
            r0 = 1
            if (r11 == 0) goto L3c
            if (r12 != 0) goto L6
            goto L3c
        L6:
            int r1 = r11.length()
            int r2 = r1 + (-1)
            int r3 = r12.length
            int r4 = r3 + (-1)
            r5 = 0
            r6 = 0
        L11:
            if (r6 >= r1) goto L3c
            char r7 = r11.charAt(r6)
            r8 = 0
        L18:
            if (r8 >= r3) goto L39
            char r9 = r12[r8]
            if (r9 != r7) goto L36
            boolean r9 = java.lang.Character.isHighSurrogate(r7)
            if (r9 == 0) goto L35
            if (r8 != r4) goto L27
            return r5
        L27:
            if (r6 >= r2) goto L36
            int r9 = r8 + 1
            char r9 = r12[r9]
            int r10 = r6 + 1
            char r10 = r11.charAt(r10)
            if (r9 != r10) goto L36
        L35:
            return r5
        L36:
            int r8 = r8 + 1
            goto L18
        L39:
            int r6 = r6 + 1
            goto L11
        L3c:
            return r0
    }

    public static boolean containsOnly(java.lang.CharSequence r0, java.lang.String r1) {
            if (r0 == 0) goto Le
            if (r1 != 0) goto L5
            goto Le
        L5:
            char[] r1 = r1.toCharArray()
            boolean r0 = containsOnly(r0, r1)
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static boolean containsOnly(java.lang.CharSequence r3, char... r4) {
            r0 = 0
            if (r4 == 0) goto L1a
            if (r3 != 0) goto L6
            goto L1a
        L6:
            int r1 = r3.length()
            r2 = 1
            if (r1 != 0) goto Le
            return r2
        Le:
            int r1 = r4.length
            if (r1 != 0) goto L12
            return r0
        L12:
            int r3 = indexOfAnyBut(r3, r4)
            r4 = -1
            if (r3 != r4) goto L1a
            r0 = 1
        L1a:
            return r0
    }

    public static boolean containsWhitespace(java.lang.CharSequence r4) {
            boolean r0 = isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r4.length()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L1e
            char r3 = r4.charAt(r2)
            boolean r3 = java.lang.Character.isWhitespace(r3)
            if (r3 == 0) goto L1b
            r4 = 1
            return r4
        L1b:
            int r2 = r2 + 1
            goto Ld
        L1e:
            return r1
    }

    private static void convertRemainingAccentCharacters(java.lang.StringBuilder r3) {
            r0 = 0
        L1:
            int r1 = r3.length()
            if (r0 >= r1) goto L2b
            char r1 = r3.charAt(r0)
            r2 = 321(0x141, float:4.5E-43)
            if (r1 != r2) goto L18
            r3.deleteCharAt(r0)
            r1 = 76
            r3.insert(r0, r1)
            goto L28
        L18:
            char r1 = r3.charAt(r0)
            r2 = 322(0x142, float:4.51E-43)
            if (r1 != r2) goto L28
            r3.deleteCharAt(r0)
            r1 = 108(0x6c, float:1.51E-43)
            r3.insert(r0, r1)
        L28:
            int r0 = r0 + 1
            goto L1
        L2b:
            return
    }

    public static int countMatches(java.lang.CharSequence r3, char r4) {
            boolean r0 = isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
        L9:
            int r2 = r3.length()
            if (r1 >= r2) goto L1a
            char r2 = r3.charAt(r1)
            if (r4 != r2) goto L17
            int r0 = r0 + 1
        L17:
            int r1 = r1 + 1
            goto L9
        L1a:
            return r0
    }

    public static int countMatches(java.lang.CharSequence r3, java.lang.CharSequence r4) {
            boolean r0 = isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto L1f
            boolean r0 = isEmpty(r4)
            if (r0 == 0) goto Le
            goto L1f
        Le:
            r0 = 0
        Lf:
            int r1 = org.apache.commons.lang3.CharSequenceUtils.indexOf(r3, r4, r1)
            r2 = -1
            if (r1 == r2) goto L1e
            int r0 = r0 + 1
            int r2 = r4.length()
            int r1 = r1 + r2
            goto Lf
        L1e:
            return r0
        L1f:
            return r1
    }

    public static <T extends java.lang.CharSequence> T defaultIfBlank(T r1, T r2) {
            boolean r0 = isBlank(r1)
            if (r0 == 0) goto L7
            r1 = r2
        L7:
            return r1
    }

    public static <T extends java.lang.CharSequence> T defaultIfEmpty(T r1, T r2) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L7
            r1 = r2
        L7:
            return r1
    }

    public static java.lang.String defaultString(java.lang.String r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = defaultString(r1, r0)
            return r1
    }

    public static java.lang.String defaultString(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            r0 = r1
        L3:
            return r0
    }

    public static java.lang.String deleteWhitespace(java.lang.String r7) {
            boolean r0 = isEmpty(r7)
            if (r0 == 0) goto L7
            return r7
        L7:
            int r0 = r7.length()
            char[] r1 = new char[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L10:
            if (r3 >= r0) goto L28
            char r5 = r7.charAt(r3)
            boolean r5 = java.lang.Character.isWhitespace(r5)
            if (r5 != 0) goto L25
            int r5 = r4 + 1
            char r6 = r7.charAt(r3)
            r1[r4] = r6
            r4 = r5
        L25:
            int r3 = r3 + 1
            goto L10
        L28:
            if (r4 != r0) goto L2b
            return r7
        L2b:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2, r4)
            return r7
    }

    public static java.lang.String difference(java.lang.String r1, java.lang.String r2) {
            if (r1 != 0) goto L3
            return r2
        L3:
            if (r2 != 0) goto L6
            return r1
        L6:
            int r1 = indexOfDifference(r1, r2)
            r0 = -1
            if (r1 != r0) goto L10
            java.lang.String r1 = ""
            return r1
        L10:
            java.lang.String r1 = r2.substring(r1)
            return r1
    }

    public static boolean endsWith(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = 0
            boolean r1 = endsWith(r1, r2, r0)
            return r1
    }

    private static boolean endsWith(java.lang.CharSequence r8, java.lang.CharSequence r9, boolean r10) {
            r0 = 0
            if (r8 == 0) goto L28
            if (r9 != 0) goto L6
            goto L28
        L6:
            int r1 = r9.length()
            int r2 = r8.length()
            if (r1 <= r2) goto L11
            return r0
        L11:
            int r0 = r8.length()
            int r1 = r9.length()
            int r4 = r0 - r1
            r6 = 0
            int r7 = r9.length()
            r2 = r8
            r3 = r10
            r5 = r9
            boolean r8 = org.apache.commons.lang3.CharSequenceUtils.regionMatches(r2, r3, r4, r5, r6, r7)
            return r8
        L28:
            if (r8 != r9) goto L2b
            r0 = 1
        L2b:
            return r0
    }

    public static boolean endsWithAny(java.lang.CharSequence r4, java.lang.CharSequence... r5) {
            boolean r0 = isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L1f
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r5)
            if (r0 == 0) goto Le
            goto L1f
        Le:
            int r0 = r5.length
            r2 = 0
        L10:
            if (r2 >= r0) goto L1f
            r3 = r5[r2]
            boolean r3 = endsWith(r4, r3)
            if (r3 == 0) goto L1c
            r4 = 1
            return r4
        L1c:
            int r2 = r2 + 1
            goto L10
        L1f:
            return r1
    }

    public static boolean endsWithIgnoreCase(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = 1
            boolean r1 = endsWith(r1, r2, r0)
            return r1
    }

    public static boolean equals(java.lang.CharSequence r6, java.lang.CharSequence r7) {
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 == 0) goto L38
            if (r7 != 0) goto La
            goto L38
        La:
            int r2 = r6.length()
            int r3 = r7.length()
            if (r2 == r3) goto L15
            return r1
        L15:
            boolean r2 = r6 instanceof java.lang.String
            if (r2 == 0) goto L22
            boolean r2 = r7 instanceof java.lang.String
            if (r2 == 0) goto L22
            boolean r6 = r6.equals(r7)
            return r6
        L22:
            int r2 = r6.length()
            r3 = 0
        L27:
            if (r3 >= r2) goto L37
            char r4 = r6.charAt(r3)
            char r5 = r7.charAt(r3)
            if (r4 == r5) goto L34
            return r1
        L34:
            int r3 = r3 + 1
            goto L27
        L37:
            return r0
        L38:
            return r1
    }

    public static boolean equalsAny(java.lang.CharSequence r4, java.lang.CharSequence... r5) {
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L18
            int r0 = r5.length
            r2 = 0
        L9:
            if (r2 >= r0) goto L18
            r3 = r5[r2]
            boolean r3 = equals(r4, r3)
            if (r3 == 0) goto L15
            r4 = 1
            return r4
        L15:
            int r2 = r2 + 1
            goto L9
        L18:
            return r1
    }

    public static boolean equalsAnyIgnoreCase(java.lang.CharSequence r4, java.lang.CharSequence... r5) {
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L18
            int r0 = r5.length
            r2 = 0
        L9:
            if (r2 >= r0) goto L18
            r3 = r5[r2]
            boolean r3 = equalsIgnoreCase(r4, r3)
            if (r3 == 0) goto L15
            r4 = 1
            return r4
        L15:
            int r2 = r2 + 1
            goto L9
        L18:
            return r1
    }

    public static boolean equalsIgnoreCase(java.lang.CharSequence r9, java.lang.CharSequence r10) {
            if (r9 != r10) goto L4
            r9 = 1
            return r9
        L4:
            r0 = 0
            if (r9 == 0) goto L23
            if (r10 != 0) goto La
            goto L23
        La:
            int r1 = r9.length()
            int r2 = r10.length()
            if (r1 == r2) goto L15
            return r0
        L15:
            r4 = 1
            r5 = 0
            r7 = 0
            int r8 = r9.length()
            r3 = r9
            r6 = r10
            boolean r9 = org.apache.commons.lang3.CharSequenceUtils.regionMatches(r3, r4, r5, r6, r7, r8)
            return r9
        L23:
            return r0
    }

    @java.lang.SafeVarargs
    public static <T extends java.lang.CharSequence> T firstNonBlank(T... r4) {
            if (r4 == 0) goto L12
            int r0 = r4.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L12
            r2 = r4[r1]
            boolean r3 = isNotBlank(r2)
            if (r3 == 0) goto Lf
            return r2
        Lf:
            int r1 = r1 + 1
            goto L4
        L12:
            r4 = 0
            return r4
    }

    @java.lang.SafeVarargs
    public static <T extends java.lang.CharSequence> T firstNonEmpty(T... r4) {
            if (r4 == 0) goto L12
            int r0 = r4.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L12
            r2 = r4[r1]
            boolean r3 = isNotEmpty(r2)
            if (r3 == 0) goto Lf
            return r2
        Lf:
            int r1 = r1 + 1
            goto L4
        L12:
            r4 = 0
            return r4
    }

    public static java.lang.String getCommonPrefix(java.lang.String... r4) {
            java.lang.String r0 = ""
            if (r4 == 0) goto L22
            int r1 = r4.length
            if (r1 != 0) goto L8
            goto L22
        L8:
            int r1 = indexOfDifference(r4)
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L18
            r1 = r4[r3]
            if (r1 != 0) goto L15
            return r0
        L15:
            r4 = r4[r3]
            return r4
        L18:
            if (r1 != 0) goto L1b
            return r0
        L1b:
            r4 = r4[r3]
            java.lang.String r4 = r4.substring(r3, r1)
            return r4
        L22:
            return r0
    }

    public static java.lang.String getDigits(java.lang.String r5) {
            boolean r0 = isEmpty(r5)
            if (r0 == 0) goto L7
            return r5
        L7:
            int r0 = r5.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
        L11:
            if (r2 >= r0) goto L23
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isDigit(r3)
            if (r4 == 0) goto L20
            r1.append(r3)
        L20:
            int r2 = r2 + 1
            goto L11
        L23:
            java.lang.String r5 = r1.toString()
            return r5
    }

    @java.lang.Deprecated
    public static int getFuzzyDistance(java.lang.CharSequence r7, java.lang.CharSequence r8, java.util.Locale r9) {
            if (r7 == 0) goto L4e
            if (r8 == 0) goto L4e
            if (r9 == 0) goto L46
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.toLowerCase(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toLowerCase(r9)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L1c:
            int r4 = r8.length()
            if (r1 >= r4) goto L45
            char r4 = r8.charAt(r1)
            r5 = 0
        L27:
            int r6 = r7.length()
            if (r3 >= r6) goto L42
            if (r5 != 0) goto L42
            char r6 = r7.charAt(r3)
            if (r4 != r6) goto L3f
            int r2 = r2 + 1
            int r9 = r9 + 1
            if (r9 != r3) goto L3d
            int r2 = r2 + 2
        L3d:
            r5 = 1
            r9 = r3
        L3f:
            int r3 = r3 + 1
            goto L27
        L42:
            int r1 = r1 + 1
            goto L1c
        L45:
            return r2
        L46:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Locale must not be null"
            r7.<init>(r8)
            throw r7
        L4e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Strings must not be null"
            r7.<init>(r8)
            throw r7
    }

    @java.lang.Deprecated
    public static double getJaroWinklerDistance(java.lang.CharSequence r7, java.lang.CharSequence r8) {
            if (r7 == 0) goto L5d
            if (r8 == 0) goto L5d
            int[] r0 = matches(r7, r8)
            r1 = 0
            r1 = r0[r1]
            double r1 = (double) r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L13
            return r3
        L13:
            int r7 = r7.length()
            double r3 = (double) r7
            double r3 = r1 / r3
            int r7 = r8.length()
            double r7 = (double) r7
            double r7 = r1 / r7
            double r3 = r3 + r7
            r7 = 1
            r7 = r0[r7]
            double r7 = (double) r7
            double r7 = r1 - r7
            double r7 = r7 / r1
            double r3 = r3 + r7
            r7 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r3 = r3 / r7
            r7 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L37
            goto L52
        L37:
            r7 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            r1 = 3
            r1 = r0[r1]
            double r1 = (double) r1
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = r5 / r1
            double r7 = java.lang.Math.min(r7, r1)
            r1 = 2
            r0 = r0[r1]
            double r0 = (double) r0
            double r7 = r7 * r0
            double r5 = r5 - r3
            double r7 = r7 * r5
            double r3 = r3 + r7
        L52:
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r7
            long r0 = java.lang.Math.round(r3)
            double r0 = (double) r0
            double r0 = r0 / r7
            return r0
        L5d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Strings must not be null"
            r7.<init>(r8)
            throw r7
    }

    @java.lang.Deprecated
    public static int getLevenshteinDistance(java.lang.CharSequence r14, java.lang.CharSequence r15) {
            if (r14 == 0) goto L65
            if (r15 == 0) goto L65
            int r0 = r14.length()
            int r1 = r15.length()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            if (r1 != 0) goto L12
            return r0
        L12:
            if (r0 <= r1) goto L1c
            int r0 = r14.length()
            r13 = r1
            r1 = r0
            r0 = r13
            goto L1f
        L1c:
            r13 = r15
            r15 = r14
            r14 = r13
        L1f:
            int r2 = r0 + 1
            int[] r2 = new int[r2]
            r3 = 0
            r4 = 0
        L25:
            if (r4 > r0) goto L2c
            r2[r4] = r4
            int r4 = r4 + 1
            goto L25
        L2c:
            r4 = 1
            r5 = 1
        L2e:
            if (r5 > r1) goto L62
            r6 = r2[r3]
            int r7 = r5 + (-1)
            char r7 = r14.charAt(r7)
            r2[r3] = r5
            r8 = 1
        L3b:
            if (r8 > r0) goto L5f
            r9 = r2[r8]
            int r10 = r8 + (-1)
            char r11 = r15.charAt(r10)
            if (r11 != r7) goto L49
            r11 = 0
            goto L4a
        L49:
            r11 = 1
        L4a:
            r10 = r2[r10]
            int r10 = r10 + r4
            r12 = r2[r8]
            int r12 = r12 + r4
            int r10 = java.lang.Math.min(r10, r12)
            int r6 = r6 + r11
            int r6 = java.lang.Math.min(r10, r6)
            r2[r8] = r6
            int r8 = r8 + 1
            r6 = r9
            goto L3b
        L5f:
            int r5 = r5 + 1
            goto L2e
        L62:
            r14 = r2[r0]
            return r14
        L65:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "Strings must not be null"
            r14.<init>(r15)
            throw r14
    }

    @java.lang.Deprecated
    public static int getLevenshteinDistance(java.lang.CharSequence r17, java.lang.CharSequence r18, int r19) {
            r0 = r19
            if (r17 == 0) goto Lc2
            if (r18 == 0) goto Lc2
            if (r0 < 0) goto Lba
            int r1 = r17.length()
            int r2 = r18.length()
            r3 = -1
            if (r1 != 0) goto L18
            if (r2 > r0) goto L16
            goto L17
        L16:
            r2 = -1
        L17:
            return r2
        L18:
            if (r2 != 0) goto L1f
            if (r1 > r0) goto L1d
            goto L1e
        L1d:
            r1 = -1
        L1e:
            return r1
        L1f:
            int r4 = r1 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r0) goto L28
            return r3
        L28:
            if (r1 <= r2) goto L35
            int r1 = r17.length()
            r5 = r1
            r4 = r2
            r1 = r17
            r2 = r18
            goto L3b
        L35:
            r4 = r1
            r5 = r2
            r2 = r17
            r1 = r18
        L3b:
            int r6 = r4 + 1
            int[] r7 = new int[r6]
            int[] r8 = new int[r6]
            int r9 = java.lang.Math.min(r4, r0)
            r10 = 1
            int r9 = r9 + r10
            r11 = 0
            r12 = 0
        L49:
            if (r12 >= r9) goto L50
            r7[r12] = r12
            int r12 = r12 + 1
            goto L49
        L50:
            r12 = 2147483647(0x7fffffff, float:NaN)
            java.util.Arrays.fill(r7, r9, r6, r12)
            java.util.Arrays.fill(r8, r12)
            r6 = 1
        L5a:
            if (r6 > r5) goto Lb2
            int r9 = r6 + (-1)
            char r9 = r1.charAt(r9)
            r8[r11] = r6
            int r13 = r6 - r0
            int r13 = java.lang.Math.max(r10, r13)
            int r14 = r12 - r0
            if (r6 <= r14) goto L70
            r14 = r4
            goto L76
        L70:
            int r14 = r6 + r0
            int r14 = java.lang.Math.min(r4, r14)
        L76:
            if (r13 <= r14) goto L79
            return r3
        L79:
            if (r13 <= r10) goto L7f
            int r15 = r13 + (-1)
            r8[r15] = r12
        L7f:
            if (r13 > r14) goto La6
            int r15 = r13 + (-1)
            char r11 = r2.charAt(r15)
            if (r11 != r9) goto L8e
            r11 = r7[r15]
            r8[r13] = r11
            goto L9f
        L8e:
            r11 = r8[r15]
            r12 = r7[r13]
            int r11 = java.lang.Math.min(r11, r12)
            r12 = r7[r15]
            int r11 = java.lang.Math.min(r11, r12)
            int r11 = r11 + r10
            r8[r13] = r11
        L9f:
            int r13 = r13 + 1
            r11 = 0
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L7f
        La6:
            int r6 = r6 + 1
            r11 = 0
            r12 = 2147483647(0x7fffffff, float:NaN)
            r16 = r8
            r8 = r7
            r7 = r16
            goto L5a
        Lb2:
            r1 = r7[r4]
            if (r1 > r0) goto Lb9
            r0 = r7[r4]
            return r0
        Lb9:
            return r3
        Lba:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Threshold must not be negative"
            r0.<init>(r1)
            throw r0
        Lc2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Strings must not be null"
            r0.<init>(r1)
            throw r0
    }

    public static int indexOf(java.lang.CharSequence r1, int r2) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = -1
            return r1
        L8:
            r0 = 0
            int r1 = org.apache.commons.lang3.CharSequenceUtils.indexOf(r1, r2, r0)
            return r1
    }

    public static int indexOf(java.lang.CharSequence r1, int r2, int r3) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = -1
            return r1
        L8:
            int r1 = org.apache.commons.lang3.CharSequenceUtils.indexOf(r1, r2, r3)
            return r1
    }

    public static int indexOf(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            if (r1 == 0) goto Lb
            if (r2 != 0) goto L5
            goto Lb
        L5:
            r0 = 0
            int r1 = org.apache.commons.lang3.CharSequenceUtils.indexOf(r1, r2, r0)
            return r1
        Lb:
            r1 = -1
            return r1
    }

    public static int indexOf(java.lang.CharSequence r0, java.lang.CharSequence r1, int r2) {
            if (r0 == 0) goto La
            if (r1 != 0) goto L5
            goto La
        L5:
            int r0 = org.apache.commons.lang3.CharSequenceUtils.indexOf(r0, r1, r2)
            return r0
        La:
            r0 = -1
            return r0
    }

    public static int indexOfAny(java.lang.CharSequence r1, java.lang.String r2) {
            boolean r0 = isEmpty(r1)
            if (r0 != 0) goto L16
            boolean r0 = isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L16
        Ld:
            char[] r2 = r2.toCharArray()
            int r1 = indexOfAny(r1, r2)
            return r1
        L16:
            r1 = -1
            return r1
    }

    public static int indexOfAny(java.lang.CharSequence r11, char... r12) {
            boolean r0 = isEmpty(r11)
            r1 = -1
            if (r0 != 0) goto L43
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r12)
            if (r0 == 0) goto Le
            goto L43
        Le:
            int r0 = r11.length()
            int r2 = r0 + (-1)
            int r3 = r12.length
            int r4 = r3 + (-1)
            r5 = 0
            r6 = 0
        L19:
            if (r6 >= r0) goto L43
            char r7 = r11.charAt(r6)
            r8 = 0
        L20:
            if (r8 >= r3) goto L40
            char r9 = r12[r8]
            if (r9 != r7) goto L3d
            if (r6 >= r2) goto L3c
            if (r8 >= r4) goto L3c
            boolean r9 = java.lang.Character.isHighSurrogate(r7)
            if (r9 == 0) goto L3c
            int r9 = r8 + 1
            char r9 = r12[r9]
            int r10 = r6 + 1
            char r10 = r11.charAt(r10)
            if (r9 != r10) goto L3d
        L3c:
            return r6
        L3d:
            int r8 = r8 + 1
            goto L20
        L40:
            int r6 = r6 + 1
            goto L19
        L43:
            return r1
    }

    public static int indexOfAny(java.lang.CharSequence r7, java.lang.CharSequence... r8) {
            r0 = -1
            if (r7 == 0) goto L27
            if (r8 != 0) goto L6
            goto L27
        L6:
            int r1 = r8.length
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
        Lf:
            if (r4 >= r1) goto L23
            r6 = r8[r4]
            if (r6 != 0) goto L16
            goto L20
        L16:
            int r6 = org.apache.commons.lang3.CharSequenceUtils.indexOf(r7, r6, r2)
            if (r6 != r0) goto L1d
            goto L20
        L1d:
            if (r6 >= r5) goto L20
            r5 = r6
        L20:
            int r4 = r4 + 1
            goto Lf
        L23:
            if (r5 != r3) goto L26
            goto L27
        L26:
            r0 = r5
        L27:
            return r0
    }

    public static int indexOfAnyBut(java.lang.CharSequence r7, java.lang.CharSequence r8) {
            boolean r0 = isEmpty(r7)
            r1 = -1
            if (r0 != 0) goto L3f
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto Le
            goto L3f
        Le:
            int r0 = r7.length()
            r2 = 0
            r3 = 0
        L14:
            if (r3 >= r0) goto L3f
            char r4 = r7.charAt(r3)
            int r5 = org.apache.commons.lang3.CharSequenceUtils.indexOf(r8, r4, r2)
            if (r5 < 0) goto L22
            r5 = 1
            goto L23
        L22:
            r5 = 0
        L23:
            int r6 = r3 + 1
            if (r6 >= r0) goto L3a
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L3a
            char r4 = r7.charAt(r6)
            if (r5 == 0) goto L3d
            int r4 = org.apache.commons.lang3.CharSequenceUtils.indexOf(r8, r4, r2)
            if (r4 >= 0) goto L3d
            return r3
        L3a:
            if (r5 != 0) goto L3d
            return r3
        L3d:
            r3 = r6
            goto L14
        L3f:
            return r1
    }

    public static int indexOfAnyBut(java.lang.CharSequence r11, char... r12) {
            boolean r0 = isEmpty(r11)
            r1 = -1
            if (r0 != 0) goto L43
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r12)
            if (r0 == 0) goto Le
            goto L43
        Le:
            int r0 = r11.length()
            int r2 = r0 + (-1)
            int r3 = r12.length
            int r4 = r3 + (-1)
            r5 = 0
            r6 = 0
        L19:
            if (r6 >= r0) goto L43
            char r7 = r11.charAt(r6)
            r8 = 0
        L20:
            if (r8 >= r3) goto L42
            char r9 = r12[r8]
            if (r9 != r7) goto L3f
            if (r6 >= r2) goto L3c
            if (r8 >= r4) goto L3c
            boolean r9 = java.lang.Character.isHighSurrogate(r7)
            if (r9 == 0) goto L3c
            int r9 = r8 + 1
            char r9 = r12[r9]
            int r10 = r6 + 1
            char r10 = r11.charAt(r10)
            if (r9 != r10) goto L3f
        L3c:
            int r6 = r6 + 1
            goto L19
        L3f:
            int r8 = r8 + 1
            goto L20
        L42:
            return r6
        L43:
            return r1
    }

    public static int indexOfDifference(java.lang.CharSequence r4, java.lang.CharSequence r5) {
            r0 = -1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 == 0) goto L32
            if (r5 != 0) goto La
            goto L32
        La:
            int r2 = r4.length()
            if (r1 >= r2) goto L24
            int r2 = r5.length()
            if (r1 >= r2) goto L24
            char r2 = r4.charAt(r1)
            char r3 = r5.charAt(r1)
            if (r2 == r3) goto L21
            goto L24
        L21:
            int r1 = r1 + 1
            goto La
        L24:
            int r5 = r5.length()
            if (r1 < r5) goto L32
            int r4 = r4.length()
            if (r1 >= r4) goto L31
            goto L32
        L31:
            return r0
        L32:
            return r1
    }

    public static int indexOfDifference(java.lang.CharSequence... r11) {
            r0 = -1
            if (r11 == 0) goto L5f
            int r1 = r11.length
            r2 = 1
            if (r1 > r2) goto L8
            goto L5f
        L8:
            int r1 = r11.length
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r4 = r11.length
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
        L12:
            if (r6 >= r4) goto L2f
            r10 = r11[r6]
            if (r10 != 0) goto L1b
            r3 = 0
            r9 = 1
            goto L2c
        L1b:
            int r7 = r10.length()
            int r3 = java.lang.Math.min(r7, r3)
            int r7 = r10.length()
            int r8 = java.lang.Math.max(r7, r8)
            r7 = 0
        L2c:
            int r6 = r6 + 1
            goto L12
        L2f:
            if (r7 != 0) goto L5f
            if (r8 != 0) goto L36
            if (r9 != 0) goto L36
            goto L5f
        L36:
            if (r3 != 0) goto L39
            return r5
        L39:
            r4 = 0
            r6 = -1
        L3b:
            if (r4 >= r3) goto L59
            r7 = r11[r5]
            char r7 = r7.charAt(r4)
            r9 = 1
        L44:
            if (r9 >= r1) goto L53
            r10 = r11[r9]
            char r10 = r10.charAt(r4)
            if (r10 == r7) goto L50
            r6 = r4
            goto L53
        L50:
            int r9 = r9 + 1
            goto L44
        L53:
            if (r6 == r0) goto L56
            goto L59
        L56:
            int r4 = r4 + 1
            goto L3b
        L59:
            if (r6 != r0) goto L5e
            if (r3 == r8) goto L5e
            return r3
        L5e:
            return r6
        L5f:
            return r0
    }

    public static int indexOfIgnoreCase(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = 0
            int r1 = indexOfIgnoreCase(r1, r2, r0)
            return r1
    }

    public static int indexOfIgnoreCase(java.lang.CharSequence r9, java.lang.CharSequence r10, int r11) {
            r0 = -1
            if (r9 == 0) goto L33
            if (r10 != 0) goto L6
            goto L33
        L6:
            if (r11 >= 0) goto L9
            r11 = 0
        L9:
            int r1 = r9.length()
            int r2 = r10.length()
            int r1 = r1 - r2
            int r1 = r1 + 1
            if (r11 <= r1) goto L17
            return r0
        L17:
            int r2 = r10.length()
            if (r2 != 0) goto L1e
            return r11
        L1e:
            if (r11 >= r1) goto L33
            r4 = 1
            r7 = 0
            int r8 = r10.length()
            r3 = r9
            r5 = r11
            r6 = r10
            boolean r2 = org.apache.commons.lang3.CharSequenceUtils.regionMatches(r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L30
            return r11
        L30:
            int r11 = r11 + 1
            goto L1e
        L33:
            return r0
    }

    public static boolean isAllBlank(java.lang.CharSequence... r5) {
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r5)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r5.length
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r0) goto L19
            r4 = r5[r3]
            boolean r4 = isNotBlank(r4)
            if (r4 == 0) goto L16
            return r2
        L16:
            int r3 = r3 + 1
            goto Lb
        L19:
            return r1
    }

    public static boolean isAllEmpty(java.lang.CharSequence... r5) {
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r5)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r5.length
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r0) goto L19
            r4 = r5[r3]
            boolean r4 = isNotEmpty(r4)
            if (r4 == 0) goto L16
            return r2
        L16:
            int r3 = r3 + 1
            goto Lb
        L19:
            return r1
    }

    public static boolean isAllLowerCase(java.lang.CharSequence r4) {
            r0 = 0
            if (r4 == 0) goto L21
            boolean r1 = isEmpty(r4)
            if (r1 == 0) goto La
            goto L21
        La:
            int r1 = r4.length()
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1f
            char r3 = r4.charAt(r2)
            boolean r3 = java.lang.Character.isLowerCase(r3)
            if (r3 != 0) goto L1c
            return r0
        L1c:
            int r2 = r2 + 1
            goto Lf
        L1f:
            r4 = 1
            return r4
        L21:
            return r0
    }

    public static boolean isAllUpperCase(java.lang.CharSequence r4) {
            r0 = 0
            if (r4 == 0) goto L21
            boolean r1 = isEmpty(r4)
            if (r1 == 0) goto La
            goto L21
        La:
            int r1 = r4.length()
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1f
            char r3 = r4.charAt(r2)
            boolean r3 = java.lang.Character.isUpperCase(r3)
            if (r3 != 0) goto L1c
            return r0
        L1c:
            int r2 = r2 + 1
            goto Lf
        L1f:
            r4 = 1
            return r4
        L21:
            return r0
    }

    public static boolean isAlpha(java.lang.CharSequence r4) {
            boolean r0 = isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r4.length()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L1d
            char r3 = r4.charAt(r2)
            boolean r3 = java.lang.Character.isLetter(r3)
            if (r3 != 0) goto L1a
            return r1
        L1a:
            int r2 = r2 + 1
            goto Ld
        L1d:
            r4 = 1
            return r4
    }

    public static boolean isAlphaSpace(java.lang.CharSequence r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.length()
            r2 = 0
        L9:
            if (r2 >= r1) goto L21
            char r3 = r5.charAt(r2)
            boolean r3 = java.lang.Character.isLetter(r3)
            if (r3 != 0) goto L1e
            char r3 = r5.charAt(r2)
            r4 = 32
            if (r3 == r4) goto L1e
            return r0
        L1e:
            int r2 = r2 + 1
            goto L9
        L21:
            r5 = 1
            return r5
    }

    public static boolean isAlphanumeric(java.lang.CharSequence r4) {
            boolean r0 = isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r4.length()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L1d
            char r3 = r4.charAt(r2)
            boolean r3 = java.lang.Character.isLetterOrDigit(r3)
            if (r3 != 0) goto L1a
            return r1
        L1a:
            int r2 = r2 + 1
            goto Ld
        L1d:
            r4 = 1
            return r4
    }

    public static boolean isAlphanumericSpace(java.lang.CharSequence r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.length()
            r2 = 0
        L9:
            if (r2 >= r1) goto L21
            char r3 = r5.charAt(r2)
            boolean r3 = java.lang.Character.isLetterOrDigit(r3)
            if (r3 != 0) goto L1e
            char r3 = r5.charAt(r2)
            r4 = 32
            if (r3 == r4) goto L1e
            return r0
        L1e:
            int r2 = r2 + 1
            goto L9
        L21:
            r5 = 1
            return r5
    }

    public static boolean isAnyBlank(java.lang.CharSequence... r4) {
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r4.length
            r2 = 0
        La:
            if (r2 >= r0) goto L19
            r3 = r4[r2]
            boolean r3 = isBlank(r3)
            if (r3 == 0) goto L16
            r4 = 1
            return r4
        L16:
            int r2 = r2 + 1
            goto La
        L19:
            return r1
    }

    public static boolean isAnyEmpty(java.lang.CharSequence... r4) {
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r4.length
            r2 = 0
        La:
            if (r2 >= r0) goto L19
            r3 = r4[r2]
            boolean r3 = isEmpty(r3)
            if (r3 == 0) goto L16
            r4 = 1
            return r4
        L16:
            int r2 = r2 + 1
            goto La
        L19:
            return r1
    }

    public static boolean isAsciiPrintable(java.lang.CharSequence r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length()
            r2 = 0
        L9:
            if (r2 >= r1) goto L19
            char r3 = r4.charAt(r2)
            boolean r3 = org.apache.commons.lang3.CharUtils.isAsciiPrintable(r3)
            if (r3 != 0) goto L16
            return r0
        L16:
            int r2 = r2 + 1
            goto L9
        L19:
            r4 = 1
            return r4
    }

    public static boolean isBlank(java.lang.CharSequence r5) {
            r0 = 1
            if (r5 == 0) goto L1c
            int r1 = r5.length()
            if (r1 != 0) goto La
            goto L1c
        La:
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L1c
            char r4 = r5.charAt(r3)
            boolean r4 = java.lang.Character.isWhitespace(r4)
            if (r4 != 0) goto L19
            return r2
        L19:
            int r3 = r3 + 1
            goto Lc
        L1c:
            return r0
    }

    public static boolean isEmpty(java.lang.CharSequence r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    public static boolean isMixedCase(java.lang.CharSequence r7) {
            boolean r0 = isEmpty(r7)
            r1 = 0
            if (r0 != 0) goto L3c
            int r0 = r7.length()
            r2 = 1
            if (r0 != r2) goto Lf
            goto L3c
        Lf:
            int r0 = r7.length()
            r3 = 0
            r4 = 0
            r5 = 0
        L16:
            if (r3 >= r0) goto L37
            if (r4 == 0) goto L1d
            if (r5 == 0) goto L1d
            return r2
        L1d:
            char r6 = r7.charAt(r3)
            boolean r6 = java.lang.Character.isUpperCase(r6)
            if (r6 == 0) goto L29
            r4 = 1
            goto L34
        L29:
            char r6 = r7.charAt(r3)
            boolean r6 = java.lang.Character.isLowerCase(r6)
            if (r6 == 0) goto L34
            r5 = 1
        L34:
            int r3 = r3 + 1
            goto L16
        L37:
            if (r4 == 0) goto L3c
            if (r5 == 0) goto L3c
            r1 = 1
        L3c:
            return r1
    }

    public static boolean isNoneBlank(java.lang.CharSequence... r0) {
            boolean r0 = isAnyBlank(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isNoneEmpty(java.lang.CharSequence... r0) {
            boolean r0 = isAnyEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isNotBlank(java.lang.CharSequence r0) {
            boolean r0 = isBlank(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isNotEmpty(java.lang.CharSequence r0) {
            boolean r0 = isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isNumeric(java.lang.CharSequence r4) {
            boolean r0 = isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r4.length()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L1d
            char r3 = r4.charAt(r2)
            boolean r3 = java.lang.Character.isDigit(r3)
            if (r3 != 0) goto L1a
            return r1
        L1a:
            int r2 = r2 + 1
            goto Ld
        L1d:
            r4 = 1
            return r4
    }

    public static boolean isNumericSpace(java.lang.CharSequence r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.length()
            r2 = 0
        L9:
            if (r2 >= r1) goto L21
            char r3 = r5.charAt(r2)
            boolean r3 = java.lang.Character.isDigit(r3)
            if (r3 != 0) goto L1e
            char r3 = r5.charAt(r2)
            r4 = 32
            if (r3 == r4) goto L1e
            return r0
        L1e:
            int r2 = r2 + 1
            goto L9
        L21:
            r5 = 1
            return r5
    }

    public static boolean isWhitespace(java.lang.CharSequence r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length()
            r2 = 0
        L9:
            if (r2 >= r1) goto L19
            char r3 = r4.charAt(r2)
            boolean r3 = java.lang.Character.isWhitespace(r3)
            if (r3 != 0) goto L16
            return r0
        L16:
            int r2 = r2 + 1
            goto L9
        L19:
            r4 = 1
            return r4
    }

    public static java.lang.String join(java.lang.Iterable<?> r0, char r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r0 = join(r0, r1)
            return r0
    }

    public static java.lang.String join(java.lang.Iterable<?> r0, java.lang.String r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r0 = join(r0, r1)
            return r0
    }

    public static java.lang.String join(java.util.Iterator<?> r3, char r4) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = r3.hasNext()
            java.lang.String r1 = ""
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.Object r0 = r3.next()
            boolean r2 = r3.hasNext()
            if (r2 != 0) goto L1c
            java.lang.String r3 = java.util.Objects.toString(r0, r1)
            return r3
        L1c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 256(0x100, float:3.59E-43)
            r1.<init>(r2)
            if (r0 == 0) goto L28
            r1.append(r0)
        L28:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            r1.append(r4)
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto L28
            r1.append(r0)
            goto L28
        L3b:
            java.lang.String r3 = r1.toString()
            return r3
    }

    public static java.lang.String join(java.util.Iterator<?> r3, java.lang.String r4) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = r3.hasNext()
            java.lang.String r1 = ""
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.Object r0 = r3.next()
            boolean r2 = r3.hasNext()
            if (r2 != 0) goto L1c
            java.lang.String r3 = java.util.Objects.toString(r0, r1)
            return r3
        L1c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 256(0x100, float:3.59E-43)
            r1.<init>(r2)
            if (r0 == 0) goto L28
            r1.append(r0)
        L28:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3d
            if (r4 == 0) goto L33
            r1.append(r4)
        L33:
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto L28
            r1.append(r0)
            goto L28
        L3d:
            java.lang.String r3 = r1.toString()
            return r3
    }

    public static java.lang.String join(java.util.List<?> r1, char r2, int r3, int r4) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            int r0 = r4 - r3
            if (r0 > 0) goto Lb
            java.lang.String r1 = ""
            return r1
        Lb:
            java.util.List r1 = r1.subList(r3, r4)
            java.util.Iterator r1 = r1.iterator()
            java.lang.String r1 = join(r1, r2)
            return r1
    }

    public static java.lang.String join(java.util.List<?> r1, java.lang.String r2, int r3, int r4) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            int r0 = r4 - r3
            if (r0 > 0) goto Lb
            java.lang.String r1 = ""
            return r1
        Lb:
            java.util.List r1 = r1.subList(r3, r4)
            java.util.Iterator r1 = r1.iterator()
            java.lang.String r1 = join(r1, r2)
            return r1
    }

    public static java.lang.String join(byte[] r2, char r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = join(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String join(byte[] r3, char r4, int r5, int r6) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r6 - r5
            if (r0 > 0) goto Lb
            java.lang.String r3 = ""
            return r3
        Lb:
            java.lang.StringBuilder r0 = newStringBuilder(r0)
            r1 = r5
        L10:
            if (r1 >= r6) goto L1f
            if (r1 <= r5) goto L17
            r0.append(r4)
        L17:
            r2 = r3[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L10
        L1f:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String join(char[] r2, char r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = join(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String join(char[] r3, char r4, int r5, int r6) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r6 - r5
            if (r0 > 0) goto Lb
            java.lang.String r3 = ""
            return r3
        Lb:
            java.lang.StringBuilder r0 = newStringBuilder(r0)
            r1 = r5
        L10:
            if (r1 >= r6) goto L1f
            if (r1 <= r5) goto L17
            r0.append(r4)
        L17:
            char r2 = r3[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L10
        L1f:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String join(double[] r2, char r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = join(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String join(double[] r4, char r5, int r6, int r7) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r7 - r6
            if (r0 > 0) goto Lb
            java.lang.String r4 = ""
            return r4
        Lb:
            java.lang.StringBuilder r0 = newStringBuilder(r0)
            r1 = r6
        L10:
            if (r1 >= r7) goto L1f
            if (r1 <= r6) goto L17
            r0.append(r5)
        L17:
            r2 = r4[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L10
        L1f:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static java.lang.String join(float[] r2, char r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = join(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String join(float[] r3, char r4, int r5, int r6) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r6 - r5
            if (r0 > 0) goto Lb
            java.lang.String r3 = ""
            return r3
        Lb:
            java.lang.StringBuilder r0 = newStringBuilder(r0)
            r1 = r5
        L10:
            if (r1 >= r6) goto L1f
            if (r1 <= r5) goto L17
            r0.append(r4)
        L17:
            r2 = r3[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L10
        L1f:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String join(int[] r2, char r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = join(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String join(int[] r3, char r4, int r5, int r6) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r6 - r5
            if (r0 > 0) goto Lb
            java.lang.String r3 = ""
            return r3
        Lb:
            java.lang.StringBuilder r0 = newStringBuilder(r0)
            r1 = r5
        L10:
            if (r1 >= r6) goto L1f
            if (r1 <= r5) goto L17
            r0.append(r4)
        L17:
            r2 = r3[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L10
        L1f:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String join(long[] r2, char r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = join(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String join(long[] r4, char r5, int r6, int r7) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r7 - r6
            if (r0 > 0) goto Lb
            java.lang.String r4 = ""
            return r4
        Lb:
            java.lang.StringBuilder r0 = newStringBuilder(r0)
            r1 = r6
        L10:
            if (r1 >= r7) goto L1f
            if (r1 <= r6) goto L17
            r0.append(r5)
        L17:
            r2 = r4[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L10
        L1f:
            java.lang.String r4 = r0.toString()
            return r4
    }

    @java.lang.SafeVarargs
    public static <T> java.lang.String join(T... r1) {
            r0 = 0
            java.lang.String r1 = join(r1, r0)
            return r1
    }

    public static java.lang.String join(java.lang.Object[] r2, char r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = join(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String join(java.lang.Object[] r3, char r4, int r5, int r6) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r6 - r5
            if (r0 > 0) goto Lb
            java.lang.String r3 = ""
            return r3
        Lb:
            java.lang.StringBuilder r0 = newStringBuilder(r0)
            r1 = r5
        L10:
            if (r1 >= r6) goto L23
            if (r1 <= r5) goto L17
            r0.append(r4)
        L17:
            r2 = r3[r1]
            if (r2 == 0) goto L20
            r2 = r3[r1]
            r0.append(r2)
        L20:
            int r1 = r1 + 1
            goto L10
        L23:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String join(java.lang.Object[] r2, java.lang.String r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = join(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String join(java.lang.Object[] r3, java.lang.String r4, int r5, int r6) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = ""
            if (r4 != 0) goto L9
            r4 = r0
        L9:
            int r1 = r6 - r5
            if (r1 > 0) goto Le
            return r0
        Le:
            java.lang.StringBuilder r0 = newStringBuilder(r1)
            r1 = r5
        L13:
            if (r1 >= r6) goto L26
            if (r1 <= r5) goto L1a
            r0.append(r4)
        L1a:
            r2 = r3[r1]
            if (r2 == 0) goto L23
            r2 = r3[r1]
            r0.append(r2)
        L23:
            int r1 = r1 + 1
            goto L13
        L26:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String join(short[] r2, char r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = join(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String join(short[] r3, char r4, int r5, int r6) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r6 - r5
            if (r0 > 0) goto Lb
            java.lang.String r3 = ""
            return r3
        Lb:
            java.lang.StringBuilder r0 = newStringBuilder(r0)
            r1 = r5
        L10:
            if (r1 >= r6) goto L1f
            if (r1 <= r5) goto L17
            r0.append(r4)
        L17:
            short r2 = r3[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L10
        L1f:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String joinWith(java.lang.String r3, java.lang.Object... r4) {
            if (r4 == 0) goto L35
            java.lang.String r3 = defaultString(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r4.next()
            java.lang.String r2 = ""
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            r0.append(r1)
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L13
            r0.append(r3)
            goto L13
        L30:
            java.lang.String r3 = r0.toString()
            return r3
        L35:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Object varargs must not be null"
            r3.<init>(r4)
            throw r3
    }

    public static int lastIndexOf(java.lang.CharSequence r1, int r2) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = -1
            return r1
        L8:
            int r0 = r1.length()
            int r1 = org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(r1, r2, r0)
            return r1
    }

    public static int lastIndexOf(java.lang.CharSequence r1, int r2, int r3) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = -1
            return r1
        L8:
            int r1 = org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(r1, r2, r3)
            return r1
    }

    public static int lastIndexOf(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            if (r1 == 0) goto Le
            if (r2 != 0) goto L5
            goto Le
        L5:
            int r0 = r1.length()
            int r1 = org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(r1, r2, r0)
            return r1
        Le:
            r1 = -1
            return r1
    }

    public static int lastIndexOf(java.lang.CharSequence r0, java.lang.CharSequence r1, int r2) {
            if (r0 == 0) goto La
            if (r1 != 0) goto L5
            goto La
        L5:
            int r0 = org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(r0, r1, r2)
            return r0
        La:
            r0 = -1
            return r0
    }

    public static int lastIndexOfAny(java.lang.CharSequence r5, java.lang.CharSequence... r6) {
            r0 = -1
            if (r5 == 0) goto L1d
            if (r6 != 0) goto L6
            goto L1d
        L6:
            int r1 = r6.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L1d
            r3 = r6[r2]
            if (r3 != 0) goto Lf
            goto L1a
        Lf:
            int r4 = r5.length()
            int r3 = org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(r5, r3, r4)
            if (r3 <= r0) goto L1a
            r0 = r3
        L1a:
            int r2 = r2 + 1
            goto L8
        L1d:
            return r0
    }

    public static int lastIndexOfIgnoreCase(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            if (r1 == 0) goto Le
            if (r2 != 0) goto L5
            goto Le
        L5:
            int r0 = r1.length()
            int r1 = lastIndexOfIgnoreCase(r1, r2, r0)
            return r1
        Le:
            r1 = -1
            return r1
    }

    public static int lastIndexOfIgnoreCase(java.lang.CharSequence r8, java.lang.CharSequence r9, int r10) {
            r0 = -1
            if (r8 == 0) goto L39
            if (r9 != 0) goto L6
            goto L39
        L6:
            int r1 = r8.length()
            int r2 = r9.length()
            int r1 = r1 - r2
            if (r10 <= r1) goto L1a
            int r10 = r8.length()
            int r1 = r9.length()
            int r10 = r10 - r1
        L1a:
            if (r10 >= 0) goto L1d
            return r0
        L1d:
            int r1 = r9.length()
            if (r1 != 0) goto L24
            return r10
        L24:
            if (r10 < 0) goto L39
            r3 = 1
            r6 = 0
            int r7 = r9.length()
            r2 = r8
            r4 = r10
            r5 = r9
            boolean r1 = org.apache.commons.lang3.CharSequenceUtils.regionMatches(r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L36
            return r10
        L36:
            int r10 = r10 + (-1)
            goto L24
        L39:
            return r0
    }

    public static int lastOrdinalIndexOf(java.lang.CharSequence r1, java.lang.CharSequence r2, int r3) {
            r0 = 1
            int r1 = ordinalIndexOf(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String left(java.lang.String r1, int r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            if (r2 >= 0) goto L9
            java.lang.String r1 = ""
            return r1
        L9:
            int r0 = r1.length()
            if (r0 > r2) goto L10
            return r1
        L10:
            r0 = 0
            java.lang.String r1 = r1.substring(r0, r2)
            return r1
    }

    public static java.lang.String leftPad(java.lang.String r1, int r2) {
            r0 = 32
            java.lang.String r1 = leftPad(r1, r2, r0)
            return r1
    }

    public static java.lang.String leftPad(java.lang.String r2, int r3, char r4) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length()
            int r0 = r3 - r0
            if (r0 > 0) goto Ld
            return r2
        Ld:
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r0 <= r1) goto L1a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = leftPad(r2, r3, r4)
            return r2
        L1a:
            java.lang.String r3 = repeat(r4, r0)
            java.lang.String r2 = r3.concat(r2)
            return r2
    }

    public static java.lang.String leftPad(java.lang.String r4, int r5, java.lang.String r6) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            boolean r0 = isEmpty(r6)
            if (r0 == 0) goto Lc
            java.lang.String r6 = " "
        Lc:
            int r0 = r6.length()
            int r1 = r4.length()
            int r1 = r5 - r1
            if (r1 > 0) goto L19
            return r4
        L19:
            r2 = 1
            r3 = 0
            if (r0 != r2) goto L2a
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r1 > r2) goto L2a
            char r6 = r6.charAt(r3)
            java.lang.String r4 = leftPad(r4, r5, r6)
            return r4
        L2a:
            if (r1 != r0) goto L31
            java.lang.String r4 = r6.concat(r4)
            return r4
        L31:
            if (r1 >= r0) goto L3c
            java.lang.String r5 = r6.substring(r3, r1)
            java.lang.String r4 = r5.concat(r4)
            return r4
        L3c:
            char[] r5 = new char[r1]
            char[] r6 = r6.toCharArray()
        L42:
            if (r3 >= r1) goto L4d
            int r2 = r3 % r0
            char r2 = r6[r2]
            r5[r3] = r2
            int r3 = r3 + 1
            goto L42
        L4d:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            java.lang.String r4 = r6.concat(r4)
            return r4
    }

    public static int length(java.lang.CharSequence r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.length()
        L8:
            return r0
    }

    public static java.lang.String lowerCase(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = r0.toLowerCase()
            return r0
    }

    public static java.lang.String lowerCase(java.lang.String r0, java.util.Locale r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = r0.toLowerCase(r1)
            return r0
    }

    private static int[] matches(java.lang.CharSequence r15, java.lang.CharSequence r16) {
            int r0 = r15.length()
            int r1 = r16.length()
            if (r0 <= r1) goto Le
            r0 = r15
            r1 = r16
            goto L11
        Le:
            r1 = r15
            r0 = r16
        L11:
            int r2 = r0.length()
            r3 = 2
            int r2 = r2 / r3
            r4 = 1
            int r2 = r2 - r4
            r5 = 0
            int r2 = java.lang.Math.max(r2, r5)
            int r6 = r1.length()
            int[] r6 = new int[r6]
            r7 = -1
            java.util.Arrays.fill(r6, r7)
            int r8 = r0.length()
            boolean[] r8 = new boolean[r8]
            r9 = 0
            r10 = 0
        L30:
            int r11 = r1.length()
            if (r9 >= r11) goto L64
            char r11 = r1.charAt(r9)
            int r12 = r9 - r2
            int r12 = java.lang.Math.max(r12, r5)
            int r13 = r9 + r2
            int r13 = r13 + r4
            int r14 = r0.length()
            int r13 = java.lang.Math.min(r13, r14)
        L4b:
            if (r12 >= r13) goto L61
            boolean r14 = r8[r12]
            if (r14 != 0) goto L5e
            char r14 = r0.charAt(r12)
            if (r11 != r14) goto L5e
            r6[r9] = r12
            r8[r12] = r4
            int r10 = r10 + 1
            goto L61
        L5e:
            int r12 = r12 + 1
            goto L4b
        L61:
            int r9 = r9 + 1
            goto L30
        L64:
            char[] r2 = new char[r10]
            char[] r9 = new char[r10]
            r11 = 0
            r12 = 0
        L6a:
            int r13 = r1.length()
            if (r11 >= r13) goto L7f
            r13 = r6[r11]
            if (r13 == r7) goto L7c
            char r13 = r1.charAt(r11)
            r2[r12] = r13
            int r12 = r12 + 1
        L7c:
            int r11 = r11 + 1
            goto L6a
        L7f:
            r6 = 0
            r7 = 0
        L81:
            int r11 = r0.length()
            if (r6 >= r11) goto L96
            boolean r11 = r8[r6]
            if (r11 == 0) goto L93
            char r11 = r0.charAt(r6)
            r9[r7] = r11
            int r7 = r7 + 1
        L93:
            int r6 = r6 + 1
            goto L81
        L96:
            r6 = 0
            r7 = 0
        L98:
            if (r6 >= r10) goto La5
            char r8 = r2[r6]
            char r11 = r9[r6]
            if (r8 == r11) goto La2
            int r7 = r7 + 1
        La2:
            int r6 = r6 + 1
            goto L98
        La5:
            r2 = 0
            r6 = 0
        La7:
            int r8 = r1.length()
            if (r2 >= r8) goto Lbf
            r8 = r15
            char r9 = r15.charAt(r2)
            r11 = r16
            char r12 = r11.charAt(r2)
            if (r9 != r12) goto Lbf
            int r6 = r6 + 1
            int r2 = r2 + 1
            goto La7
        Lbf:
            r1 = 4
            int[] r1 = new int[r1]
            r1[r5] = r10
            int r7 = r7 / r3
            r1[r4] = r7
            r1[r3] = r6
            r2 = 3
            int r0 = r0.length()
            r1[r2] = r0
            return r1
    }

    public static java.lang.String mid(java.lang.String r1, int r2, int r3) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            if (r3 < 0) goto L21
            int r0 = r1.length()
            if (r2 <= r0) goto Ld
            goto L21
        Ld:
            if (r2 >= 0) goto L10
            r2 = 0
        L10:
            int r0 = r1.length()
            int r3 = r3 + r2
            if (r0 > r3) goto L1c
            java.lang.String r1 = r1.substring(r2)
            return r1
        L1c:
            java.lang.String r1 = r1.substring(r2, r3)
            return r1
        L21:
            java.lang.String r1 = ""
            return r1
    }

    private static java.lang.StringBuilder newStringBuilder(int r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r1 * 16
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String normalizeSpace(java.lang.String r10) {
            boolean r0 = isEmpty(r10)
            if (r0 == 0) goto L7
            return r10
        L7:
            int r0 = r10.length()
            char[] r1 = new char[r0]
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 0
        L13:
            if (r4 >= r0) goto L41
            char r8 = r10.charAt(r4)
            boolean r9 = java.lang.Character.isWhitespace(r8)
            if (r9 == 0) goto L31
            if (r7 != 0) goto L2e
            if (r5 != 0) goto L2e
            int r8 = r6 + 1
            java.lang.String r9 = " "
            char r9 = r9.charAt(r3)
            r1[r6] = r9
            r6 = r8
        L2e:
            int r7 = r7 + 1
            goto L3e
        L31:
            int r5 = r6 + 1
            r7 = 160(0xa0, float:2.24E-43)
            if (r8 != r7) goto L39
            r8 = 32
        L39:
            r1[r6] = r8
            r6 = r5
            r5 = 0
            r7 = 0
        L3e:
            int r4 = r4 + 1
            goto L13
        L41:
            if (r5 == 0) goto L46
            java.lang.String r10 = ""
            return r10
        L46:
            java.lang.String r10 = new java.lang.String
            if (r7 <= 0) goto L4b
            goto L4c
        L4b:
            r2 = 0
        L4c:
            int r6 = r6 - r2
            r10.<init>(r1, r3, r6)
            java.lang.String r10 = r10.trim()
            return r10
    }

    public static int ordinalIndexOf(java.lang.CharSequence r1, java.lang.CharSequence r2, int r3) {
            r0 = 0
            int r1 = ordinalIndexOf(r1, r2, r3, r0)
            return r1
    }

    private static int ordinalIndexOf(java.lang.CharSequence r3, java.lang.CharSequence r4, int r5, boolean r6) {
            r0 = -1
            if (r3 == 0) goto L32
            if (r4 == 0) goto L32
            if (r5 > 0) goto L8
            goto L32
        L8:
            int r1 = r4.length()
            r2 = 0
            if (r1 != 0) goto L16
            if (r6 == 0) goto L15
            int r2 = r3.length()
        L15:
            return r2
        L16:
            if (r6 == 0) goto L1c
            int r0 = r3.length()
        L1c:
            if (r6 == 0) goto L25
            int r0 = r0 + (-1)
            int r0 = org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(r3, r4, r0)
            goto L2b
        L25:
            int r0 = r0 + 1
            int r0 = org.apache.commons.lang3.CharSequenceUtils.indexOf(r3, r4, r0)
        L2b:
            if (r0 >= 0) goto L2e
            return r0
        L2e:
            int r2 = r2 + 1
            if (r2 < r5) goto L1c
        L32:
            return r0
    }

    public static java.lang.String overlay(java.lang.String r3, java.lang.String r4, int r5, int r6) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            if (r4 != 0) goto L8
            java.lang.String r4 = ""
        L8:
            int r0 = r3.length()
            r1 = 0
            if (r5 >= 0) goto L10
            r5 = 0
        L10:
            if (r5 <= r0) goto L13
            r5 = r0
        L13:
            if (r6 >= 0) goto L16
            r6 = 0
        L16:
            if (r6 <= r0) goto L19
            goto L1a
        L19:
            r0 = r6
        L1a:
            if (r5 <= r0) goto L1f
            r2 = r0
            r0 = r5
            r5 = r2
        L1f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r3.substring(r1, r5)
            r6.append(r5)
            r6.append(r4)
            java.lang.String r3 = r3.substring(r0)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            return r3
    }

    private static java.lang.String prependIfMissing(java.lang.String r3, java.lang.CharSequence r4, boolean r5, java.lang.CharSequence... r6) {
            if (r3 == 0) goto L37
            boolean r0 = isEmpty(r4)
            if (r0 != 0) goto L37
            boolean r0 = startsWith(r3, r4, r5)
            if (r0 == 0) goto Lf
            goto L37
        Lf:
            if (r6 == 0) goto L24
            int r0 = r6.length
            if (r0 <= 0) goto L24
            int r0 = r6.length
            r1 = 0
        L16:
            if (r1 >= r0) goto L24
            r2 = r6[r1]
            boolean r2 = startsWith(r3, r2, r5)
            if (r2 == 0) goto L21
            return r3
        L21:
            int r1 = r1 + 1
            goto L16
        L24:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = r4.toString()
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L37:
            return r3
    }

    public static java.lang.String prependIfMissing(java.lang.String r1, java.lang.CharSequence r2, java.lang.CharSequence... r3) {
            r0 = 0
            java.lang.String r1 = prependIfMissing(r1, r2, r0, r3)
            return r1
    }

    public static java.lang.String prependIfMissingIgnoreCase(java.lang.String r1, java.lang.CharSequence r2, java.lang.CharSequence... r3) {
            r0 = 1
            java.lang.String r1 = prependIfMissing(r1, r2, r0, r3)
            return r1
    }

    public static java.lang.String remove(java.lang.String r5, char r6) {
            boolean r0 = isEmpty(r5)
            if (r0 != 0) goto L2c
            int r0 = r5.indexOf(r6)
            r1 = -1
            if (r0 != r1) goto Le
            goto L2c
        Le:
            char[] r5 = r5.toCharArray()
            r0 = 0
            r1 = 0
            r2 = 0
        L15:
            int r3 = r5.length
            if (r1 >= r3) goto L26
            char r3 = r5[r1]
            if (r3 == r6) goto L23
            int r3 = r2 + 1
            char r4 = r5[r1]
            r5[r2] = r4
            r2 = r3
        L23:
            int r1 = r1 + 1
            goto L15
        L26:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5, r0, r2)
            return r6
        L2c:
            return r5
    }

    public static java.lang.String remove(java.lang.String r2, java.lang.String r3) {
            boolean r0 = isEmpty(r2)
            if (r0 != 0) goto L14
            boolean r0 = isEmpty(r3)
            if (r0 == 0) goto Ld
            goto L14
        Ld:
            r0 = -1
            java.lang.String r1 = ""
            java.lang.String r2 = replace(r2, r3, r1, r0)
        L14:
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String removeAll(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = org.apache.commons.lang3.RegExUtils.removeAll(r0, r1)
            return r0
    }

    public static java.lang.String removeEnd(java.lang.String r2, java.lang.String r3) {
            boolean r0 = isEmpty(r2)
            if (r0 != 0) goto L21
            boolean r0 = isEmpty(r3)
            if (r0 == 0) goto Ld
            goto L21
        Ld:
            boolean r0 = r2.endsWith(r3)
            if (r0 == 0) goto L21
            r0 = 0
            int r1 = r2.length()
            int r3 = r3.length()
            int r1 = r1 - r3
            java.lang.String r2 = r2.substring(r0, r1)
        L21:
            return r2
    }

    public static java.lang.String removeEndIgnoreCase(java.lang.String r2, java.lang.String r3) {
            boolean r0 = isEmpty(r2)
            if (r0 != 0) goto L21
            boolean r0 = isEmpty(r3)
            if (r0 == 0) goto Ld
            goto L21
        Ld:
            boolean r0 = endsWithIgnoreCase(r2, r3)
            if (r0 == 0) goto L21
            r0 = 0
            int r1 = r2.length()
            int r3 = r3.length()
            int r1 = r1 - r3
            java.lang.String r2 = r2.substring(r0, r1)
        L21:
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String removeFirst(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = replaceFirst(r1, r2, r0)
            return r1
    }

    public static java.lang.String removeIgnoreCase(java.lang.String r2, java.lang.String r3) {
            boolean r0 = isEmpty(r2)
            if (r0 != 0) goto L14
            boolean r0 = isEmpty(r3)
            if (r0 == 0) goto Ld
            goto L14
        Ld:
            r0 = -1
            java.lang.String r1 = ""
            java.lang.String r2 = replaceIgnoreCase(r2, r3, r1, r0)
        L14:
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String removePattern(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = org.apache.commons.lang3.RegExUtils.removePattern(r0, r1)
            return r0
    }

    public static java.lang.String removeStart(java.lang.String r1, java.lang.String r2) {
            boolean r0 = isEmpty(r1)
            if (r0 != 0) goto L1b
            boolean r0 = isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L1b
        Ld:
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L1b
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
        L1b:
            return r1
    }

    public static java.lang.String removeStartIgnoreCase(java.lang.String r1, java.lang.String r2) {
            boolean r0 = isEmpty(r1)
            if (r0 != 0) goto L1b
            boolean r0 = isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L1b
        Ld:
            boolean r0 = startsWithIgnoreCase(r1, r2)
            if (r0 == 0) goto L1b
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
        L1b:
            return r1
    }

    public static java.lang.String repeat(char r1, int r2) {
            if (r2 > 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            char[] r0 = new char[r2]
            int r2 = r2 + (-1)
        L9:
            if (r2 < 0) goto L10
            r0[r2] = r1
            int r2 = r2 + (-1)
            goto L9
        L10:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
    }

    public static java.lang.String repeat(java.lang.String r5, int r6) {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            if (r6 > 0) goto L9
            java.lang.String r5 = ""
            return r5
        L9:
            int r0 = r5.length()
            r1 = 1
            if (r6 == r1) goto L64
            if (r0 != 0) goto L13
            goto L64
        L13:
            r2 = 0
            if (r0 != r1) goto L23
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r6 > r3) goto L23
            char r5 = r5.charAt(r2)
            java.lang.String r5 = repeat(r5, r6)
            return r5
        L23:
            int r3 = r0 * r6
            if (r0 == r1) goto L5c
            r4 = 2
            if (r0 == r4) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
        L2f:
            if (r2 >= r6) goto L37
            r0.append(r5)
            int r2 = r2 + 1
            goto L2f
        L37:
            java.lang.String r5 = r0.toString()
            return r5
        L3c:
            char r0 = r5.charAt(r2)
            char r5 = r5.charAt(r1)
            char[] r1 = new char[r3]
            int r6 = r6 * 2
            int r6 = r6 - r4
        L49:
            if (r6 < 0) goto L56
            r1[r6] = r0
            int r2 = r6 + 1
            r1[r2] = r5
            int r6 = r6 + (-1)
            int r6 = r6 + (-1)
            goto L49
        L56:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
            return r5
        L5c:
            char r5 = r5.charAt(r2)
            java.lang.String r5 = repeat(r5, r6)
        L64:
            return r5
    }

    public static java.lang.String repeat(java.lang.String r1, java.lang.String r2, int r3) {
            if (r1 == 0) goto L1d
            if (r2 != 0) goto L5
            goto L1d
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.String r1 = repeat(r1, r3)
            java.lang.String r1 = removeEnd(r1, r2)
            return r1
        L1d:
            java.lang.String r1 = repeat(r1, r3)
            return r1
    }

    public static java.lang.String replace(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = -1
            java.lang.String r1 = replace(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String replace(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = 0
            java.lang.String r1 = replace(r1, r2, r3, r4, r0)
            return r1
    }

    private static java.lang.String replace(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, boolean r11) {
            boolean r0 = isEmpty(r7)
            if (r0 != 0) goto L67
            boolean r0 = isEmpty(r8)
            if (r0 != 0) goto L67
            if (r9 == 0) goto L67
            if (r10 != 0) goto L11
            goto L67
        L11:
            if (r11 == 0) goto L1c
            java.lang.String r11 = r7.toLowerCase()
            java.lang.String r8 = r8.toLowerCase()
            goto L1d
        L1c:
            r11 = r7
        L1d:
            r0 = 0
            int r1 = r11.indexOf(r8, r0)
            r2 = -1
            if (r1 != r2) goto L26
            return r7
        L26:
            int r3 = r8.length()
            int r4 = r9.length()
            int r4 = r4 - r3
            if (r4 >= 0) goto L32
            r4 = 0
        L32:
            r5 = 64
            if (r10 >= 0) goto L39
            r5 = 16
            goto L3d
        L39:
            if (r10 <= r5) goto L3c
            goto L3d
        L3c:
            r5 = r10
        L3d:
            int r4 = r4 * r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r6 = r7.length()
            int r6 = r6 + r4
            r5.<init>(r6)
        L49:
            if (r1 == r2) goto L5c
            r5.append(r7, r0, r1)
            r5.append(r9)
            int r0 = r1 + r3
            int r10 = r10 + r2
            if (r10 != 0) goto L57
            goto L5c
        L57:
            int r1 = r11.indexOf(r8, r0)
            goto L49
        L5c:
            int r8 = r7.length()
            r5.append(r7, r0, r8)
            java.lang.String r7 = r5.toString()
        L67:
            return r7
    }

    @java.lang.Deprecated
    public static java.lang.String replaceAll(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = org.apache.commons.lang3.RegExUtils.replaceAll(r0, r1, r2)
            return r0
    }

    public static java.lang.String replaceChars(java.lang.String r0, char r1, char r2) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public static java.lang.String replaceChars(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            boolean r0 = isEmpty(r7)
            if (r0 != 0) goto L43
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto Ld
            goto L43
        Ld:
            if (r9 != 0) goto L11
            java.lang.String r9 = ""
        L11:
            int r0 = r9.length()
            int r1 = r7.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r3 = 0
            r4 = 0
        L20:
            if (r3 >= r1) goto L3d
            char r5 = r7.charAt(r3)
            int r6 = r8.indexOf(r5)
            if (r6 < 0) goto L37
            if (r6 >= r0) goto L35
            char r4 = r9.charAt(r6)
            r2.append(r4)
        L35:
            r4 = 1
            goto L3a
        L37:
            r2.append(r5)
        L3a:
            int r3 = r3 + 1
            goto L20
        L3d:
            if (r4 == 0) goto L43
            java.lang.String r7 = r2.toString()
        L43:
            return r7
    }

    public static java.lang.String replaceEach(java.lang.String r1, java.lang.String[] r2, java.lang.String[] r3) {
            r0 = 0
            java.lang.String r1 = replaceEach(r1, r2, r3, r0, r0)
            return r1
    }

    private static java.lang.String replaceEach(java.lang.String r11, java.lang.String[] r12, java.lang.String[] r13, boolean r14, int r15) {
            if (r11 == 0) goto L114
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L114
            if (r12 == 0) goto L114
            int r0 = r12.length
            if (r0 == 0) goto L114
            if (r13 == 0) goto L114
            int r0 = r13.length
            if (r0 != 0) goto L14
            goto L114
        L14:
            if (r15 < 0) goto L10c
            int r0 = r12.length
            int r1 = r13.length
            if (r0 != r1) goto Led
            boolean[] r1 = new boolean[r0]
            r2 = 0
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L21:
            r7 = 1
            if (r4 >= r0) goto L4d
            boolean r8 = r1[r4]
            if (r8 != 0) goto L4a
            r8 = r12[r4]
            if (r8 == 0) goto L4a
            r8 = r12[r4]
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L4a
            r8 = r13[r4]
            if (r8 != 0) goto L39
            goto L4a
        L39:
            r8 = r12[r4]
            int r8 = r11.indexOf(r8)
            if (r8 != r3) goto L44
            r1[r4] = r7
            goto L4a
        L44:
            if (r5 == r3) goto L48
            if (r8 >= r5) goto L4a
        L48:
            r6 = r4
            r5 = r8
        L4a:
            int r4 = r4 + 1
            goto L21
        L4d:
            if (r5 != r3) goto L50
            return r11
        L50:
            r4 = 0
            r8 = 0
        L52:
            int r9 = r12.length
            if (r4 >= r9) goto L73
            r9 = r12[r4]
            if (r9 == 0) goto L70
            r9 = r13[r4]
            if (r9 != 0) goto L5e
            goto L70
        L5e:
            r9 = r13[r4]
            int r9 = r9.length()
            r10 = r12[r4]
            int r10 = r10.length()
            int r9 = r9 - r10
            if (r9 <= 0) goto L70
            int r9 = r9 * 3
            int r8 = r8 + r9
        L70:
            int r4 = r4 + 1
            goto L52
        L73:
            int r4 = r11.length()
            int r4 = r4 / 5
            int r4 = java.lang.Math.min(r8, r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r9 = r11.length()
            int r9 = r9 + r4
            r8.<init>(r9)
            r4 = 0
        L88:
            if (r5 == r3) goto Ld0
        L8a:
            if (r4 >= r5) goto L96
            char r9 = r11.charAt(r4)
            r8.append(r9)
            int r4 = r4 + 1
            goto L8a
        L96:
            r4 = r13[r6]
            r8.append(r4)
            r4 = r12[r6]
            int r4 = r4.length()
            int r4 = r4 + r5
            r5 = -1
            r6 = -1
            r9 = 0
        La5:
            if (r9 >= r0) goto L88
            boolean r10 = r1[r9]
            if (r10 != 0) goto Lcd
            r10 = r12[r9]
            if (r10 == 0) goto Lcd
            r10 = r12[r9]
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto Lcd
            r10 = r13[r9]
            if (r10 != 0) goto Lbc
            goto Lcd
        Lbc:
            r10 = r12[r9]
            int r10 = r11.indexOf(r10, r4)
            if (r10 != r3) goto Lc7
            r1[r9] = r7
            goto Lcd
        Lc7:
            if (r5 == r3) goto Lcb
            if (r10 >= r5) goto Lcd
        Lcb:
            r6 = r9
            r5 = r10
        Lcd:
            int r9 = r9 + 1
            goto La5
        Ld0:
            int r0 = r11.length()
        Ld4:
            if (r4 >= r0) goto Le0
            char r1 = r11.charAt(r4)
            r8.append(r1)
            int r4 = r4 + 1
            goto Ld4
        Le0:
            java.lang.String r11 = r8.toString()
            if (r14 != 0) goto Le7
            return r11
        Le7:
            int r15 = r15 - r7
            java.lang.String r11 = replaceEach(r11, r12, r13, r14, r15)
            return r11
        Led:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Search and Replace array lengths don't match: "
            r12.append(r13)
            r12.append(r0)
            java.lang.String r13 = " vs "
            r12.append(r13)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L10c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Aborting to protect against StackOverflowError - output of one loop is the input of another"
            r11.<init>(r12)
            throw r11
        L114:
            return r11
    }

    public static java.lang.String replaceEachRepeatedly(java.lang.String r2, java.lang.String[] r3, java.lang.String[] r4) {
            if (r3 != 0) goto L4
            r0 = 0
            goto L5
        L4:
            int r0 = r3.length
        L5:
            r1 = 1
            java.lang.String r2 = replaceEach(r2, r3, r4, r1, r0)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String replaceFirst(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = org.apache.commons.lang3.RegExUtils.replaceFirst(r0, r1, r2)
            return r0
    }

    public static java.lang.String replaceIgnoreCase(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = -1
            java.lang.String r1 = replaceIgnoreCase(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String replaceIgnoreCase(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = 1
            java.lang.String r1 = replace(r1, r2, r3, r4, r0)
            return r1
    }

    public static java.lang.String replaceOnce(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = 1
            java.lang.String r1 = replace(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String replaceOnceIgnoreCase(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = 1
            java.lang.String r1 = replaceIgnoreCase(r1, r2, r3, r0)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String replacePattern(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = org.apache.commons.lang3.RegExUtils.replacePattern(r0, r1, r2)
            return r0
    }

    public static java.lang.String reverse(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r1 = r0.reverse()
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static java.lang.String reverseDelimited(java.lang.String r0, char r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String[] r0 = split(r0, r1)
            org.apache.commons.lang3.ArrayUtils.reverse(r0)
            java.lang.String r0 = join(r0, r1)
            return r0
    }

    public static java.lang.String right(java.lang.String r1, int r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            if (r2 >= 0) goto L9
            java.lang.String r1 = ""
            return r1
        L9:
            int r0 = r1.length()
            if (r0 > r2) goto L10
            return r1
        L10:
            int r0 = r1.length()
            int r0 = r0 - r2
            java.lang.String r1 = r1.substring(r0)
            return r1
    }

    public static java.lang.String rightPad(java.lang.String r1, int r2) {
            r0 = 32
            java.lang.String r1 = rightPad(r1, r2, r0)
            return r1
    }

    public static java.lang.String rightPad(java.lang.String r2, int r3, char r4) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length()
            int r0 = r3 - r0
            if (r0 > 0) goto Ld
            return r2
        Ld:
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r0 <= r1) goto L1a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = rightPad(r2, r3, r4)
            return r2
        L1a:
            java.lang.String r3 = repeat(r4, r0)
            java.lang.String r2 = r2.concat(r3)
            return r2
    }

    public static java.lang.String rightPad(java.lang.String r4, int r5, java.lang.String r6) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            boolean r0 = isEmpty(r6)
            if (r0 == 0) goto Lc
            java.lang.String r6 = " "
        Lc:
            int r0 = r6.length()
            int r1 = r4.length()
            int r1 = r5 - r1
            if (r1 > 0) goto L19
            return r4
        L19:
            r2 = 1
            r3 = 0
            if (r0 != r2) goto L2a
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r1 > r2) goto L2a
            char r6 = r6.charAt(r3)
            java.lang.String r4 = rightPad(r4, r5, r6)
            return r4
        L2a:
            if (r1 != r0) goto L31
            java.lang.String r4 = r4.concat(r6)
            return r4
        L31:
            if (r1 >= r0) goto L3c
            java.lang.String r5 = r6.substring(r3, r1)
            java.lang.String r4 = r4.concat(r5)
            return r4
        L3c:
            char[] r5 = new char[r1]
            char[] r6 = r6.toCharArray()
        L42:
            if (r3 >= r1) goto L4d
            int r2 = r3 % r0
            char r2 = r6[r2]
            r5[r3] = r2
            int r3 = r3 + 1
            goto L42
        L4d:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            java.lang.String r4 = r4.concat(r6)
            return r4
    }

    public static java.lang.String rotate(java.lang.String r2, int r3) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length()
            if (r3 == 0) goto L29
            if (r0 == 0) goto L29
            int r3 = r3 % r0
            if (r3 != 0) goto L10
            goto L29
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r3 = -r3
            java.lang.String r0 = substring(r2, r3)
            r1.append(r0)
            r0 = 0
            java.lang.String r2 = substring(r2, r0, r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L29:
            return r2
    }

    public static java.lang.String[] split(java.lang.String r2) {
            r0 = 0
            r1 = -1
            java.lang.String[] r2 = split(r2, r0, r1)
            return r2
    }

    public static java.lang.String[] split(java.lang.String r1, char r2) {
            r0 = 0
            java.lang.String[] r1 = splitWorker(r1, r2, r0)
            return r1
    }

    public static java.lang.String[] split(java.lang.String r2, java.lang.String r3) {
            r0 = -1
            r1 = 0
            java.lang.String[] r2 = splitWorker(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String[] split(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = 0
            java.lang.String[] r1 = splitWorker(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String[] splitByCharacterType(java.lang.String r1) {
            r0 = 0
            java.lang.String[] r1 = splitByCharacterType(r1, r0)
            return r1
    }

    private static java.lang.String[] splitByCharacterType(java.lang.String r8, boolean r9) {
            if (r8 != 0) goto L4
            r8 = 0
            return r8
        L4:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto Ld
            java.lang.String[] r8 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            return r8
        Ld:
            char[] r8 = r8.toCharArray()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            char r2 = r8[r1]
            int r2 = java.lang.Character.getType(r2)
            r3 = 1
            r4 = 1
        L1f:
            int r5 = r8.length
            if (r4 >= r5) goto L51
            char r5 = r8[r4]
            int r5 = java.lang.Character.getType(r5)
            if (r5 != r2) goto L2b
            goto L4e
        L2b:
            if (r9 == 0) goto L42
            r6 = 2
            if (r5 != r6) goto L42
            if (r2 != r3) goto L42
            int r2 = r4 + (-1)
            if (r2 == r1) goto L4d
            java.lang.String r6 = new java.lang.String
            int r7 = r2 - r1
            r6.<init>(r8, r1, r7)
            r0.add(r6)
            r1 = r2
            goto L4d
        L42:
            java.lang.String r2 = new java.lang.String
            int r6 = r4 - r1
            r2.<init>(r8, r1, r6)
            r0.add(r2)
            r1 = r4
        L4d:
            r2 = r5
        L4e:
            int r4 = r4 + 1
            goto L1f
        L51:
            java.lang.String r9 = new java.lang.String
            int r2 = r8.length
            int r2 = r2 - r1
            r9.<init>(r8, r1, r2)
            r0.add(r9)
            int r8 = r0.size()
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
    }

    public static java.lang.String[] splitByCharacterTypeCamelCase(java.lang.String r1) {
            r0 = 1
            java.lang.String[] r1 = splitByCharacterType(r1, r0)
            return r1
    }

    public static java.lang.String[] splitByWholeSeparator(java.lang.String r2, java.lang.String r3) {
            r0 = -1
            r1 = 0
            java.lang.String[] r2 = splitByWholeSeparatorWorker(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String[] splitByWholeSeparator(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = 0
            java.lang.String[] r1 = splitByWholeSeparatorWorker(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String[] splitByWholeSeparatorPreserveAllTokens(java.lang.String r2, java.lang.String r3) {
            r0 = -1
            r1 = 1
            java.lang.String[] r2 = splitByWholeSeparatorWorker(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String[] splitByWholeSeparatorPreserveAllTokens(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = 1
            java.lang.String[] r1 = splitByWholeSeparatorWorker(r1, r2, r3, r0)
            return r1
    }

    private static java.lang.String[] splitByWholeSeparatorWorker(java.lang.String r8, java.lang.String r9, int r10, boolean r11) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            int r1 = r8.length()
            if (r1 != 0) goto Ld
            java.lang.String[] r8 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            return r8
        Ld:
            if (r9 == 0) goto L6e
            java.lang.String r2 = ""
            boolean r3 = r2.equals(r9)
            if (r3 == 0) goto L18
            goto L6e
        L18:
            int r0 = r9.length()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r5 = 0
            r6 = 0
        L24:
            if (r4 >= r1) goto L61
            int r4 = r8.indexOf(r9, r5)
            r7 = -1
            if (r4 <= r7) goto L58
            if (r4 <= r5) goto L43
            int r6 = r6 + 1
            if (r6 != r10) goto L3b
            java.lang.String r4 = r8.substring(r5)
            r3.add(r4)
            goto L5f
        L3b:
            java.lang.String r5 = r8.substring(r5, r4)
            r3.add(r5)
            goto L55
        L43:
            if (r11 == 0) goto L55
            int r6 = r6 + 1
            if (r6 != r10) goto L52
            java.lang.String r4 = r8.substring(r5)
            r3.add(r4)
            r4 = r1
            goto L55
        L52:
            r3.add(r2)
        L55:
            int r5 = r4 + r0
            goto L24
        L58:
            java.lang.String r4 = r8.substring(r5)
            r3.add(r4)
        L5f:
            r4 = r1
            goto L24
        L61:
            int r8 = r3.size()
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.Object[] r8 = r3.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
        L6e:
            java.lang.String[] r8 = splitWorker(r8, r0, r10, r11)
            return r8
    }

    public static java.lang.String[] splitPreserveAllTokens(java.lang.String r3) {
            r0 = 0
            r1 = -1
            r2 = 1
            java.lang.String[] r3 = splitWorker(r3, r0, r1, r2)
            return r3
    }

    public static java.lang.String[] splitPreserveAllTokens(java.lang.String r1, char r2) {
            r0 = 1
            java.lang.String[] r1 = splitWorker(r1, r2, r0)
            return r1
    }

    public static java.lang.String[] splitPreserveAllTokens(java.lang.String r2, java.lang.String r3) {
            r0 = -1
            r1 = 1
            java.lang.String[] r2 = splitWorker(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String[] splitPreserveAllTokens(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = 1
            java.lang.String[] r1 = splitWorker(r1, r2, r3, r0)
            return r1
    }

    private static java.lang.String[] splitWorker(java.lang.String r9, char r10, boolean r11) {
            if (r9 != 0) goto L4
            r9 = 0
            return r9
        L4:
            int r0 = r9.length()
            if (r0 != 0) goto Ld
            java.lang.String[] r9 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            return r9
        Ld:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L18:
            if (r4 >= r0) goto L36
            char r8 = r9.charAt(r4)
            if (r8 != r10) goto L31
            if (r5 != 0) goto L24
            if (r11 == 0) goto L2d
        L24:
            java.lang.String r5 = r9.substring(r7, r4)
            r1.add(r5)
            r5 = 0
            r6 = 1
        L2d:
            int r7 = r4 + 1
            r4 = r7
            goto L18
        L31:
            int r4 = r4 + 1
            r5 = 1
            r6 = 0
            goto L18
        L36:
            if (r5 != 0) goto L3c
            if (r11 == 0) goto L43
            if (r6 == 0) goto L43
        L3c:
            java.lang.String r9 = r9.substring(r7, r4)
            r1.add(r9)
        L43:
            int r9 = r1.size()
            java.lang.String[] r9 = new java.lang.String[r9]
            java.lang.Object[] r9 = r1.toArray(r9)
            java.lang.String[] r9 = (java.lang.String[]) r9
            return r9
    }

    private static java.lang.String[] splitWorker(java.lang.String r10, java.lang.String r11, int r12, boolean r13) {
            if (r10 != 0) goto L4
            r10 = 0
            return r10
        L4:
            int r0 = r10.length()
            if (r0 != 0) goto Ld
            java.lang.String[] r10 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            return r10
        Ld:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            if (r11 != 0) goto L45
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
        L1b:
            if (r11 >= r0) goto Lad
            char r8 = r10.charAt(r11)
            boolean r8 = java.lang.Character.isWhitespace(r8)
            if (r8 == 0) goto L40
            if (r4 != 0) goto L2b
            if (r13 == 0) goto L3c
        L2b:
            int r4 = r7 + 1
            if (r7 != r12) goto L32
            r11 = r0
            r5 = 0
            goto L33
        L32:
            r5 = 1
        L33:
            java.lang.String r6 = r10.substring(r6, r11)
            r1.add(r6)
            r7 = r4
            r4 = 0
        L3c:
            int r6 = r11 + 1
            r11 = r6
            goto L1b
        L40:
            int r11 = r11 + 1
            r4 = 1
            r5 = 0
            goto L1b
        L45:
            int r4 = r11.length()
            if (r4 != r3) goto L7a
            char r11 = r11.charAt(r2)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
        L54:
            if (r4 >= r0) goto La9
            char r9 = r10.charAt(r4)
            if (r9 != r11) goto L75
            if (r5 != 0) goto L60
            if (r13 == 0) goto L71
        L60:
            int r5 = r8 + 1
            if (r8 != r12) goto L67
            r4 = r0
            r6 = 0
            goto L68
        L67:
            r6 = 1
        L68:
            java.lang.String r7 = r10.substring(r7, r4)
            r1.add(r7)
            r8 = r5
            r5 = 0
        L71:
            int r7 = r4 + 1
            r4 = r7
            goto L54
        L75:
            int r4 = r4 + 1
            r5 = 1
            r6 = 0
            goto L54
        L7a:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
        L7f:
            if (r4 >= r0) goto La9
            char r9 = r10.charAt(r4)
            int r9 = r11.indexOf(r9)
            if (r9 < 0) goto La4
            if (r5 != 0) goto L8f
            if (r13 == 0) goto La0
        L8f:
            int r5 = r8 + 1
            if (r8 != r12) goto L96
            r4 = r0
            r6 = 0
            goto L97
        L96:
            r6 = 1
        L97:
            java.lang.String r7 = r10.substring(r7, r4)
            r1.add(r7)
            r8 = r5
            r5 = 0
        La0:
            int r7 = r4 + 1
            r4 = r7
            goto L7f
        La4:
            int r4 = r4 + 1
            r5 = 1
            r6 = 0
            goto L7f
        La9:
            r11 = r4
            r4 = r5
            r5 = r6
            r6 = r7
        Lad:
            if (r4 != 0) goto Lb3
            if (r13 == 0) goto Lba
            if (r5 == 0) goto Lba
        Lb3:
            java.lang.String r10 = r10.substring(r6, r11)
            r1.add(r10)
        Lba:
            int r10 = r1.size()
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.Object[] r10 = r1.toArray(r10)
            java.lang.String[] r10 = (java.lang.String[]) r10
            return r10
    }

    public static boolean startsWith(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = 0
            boolean r1 = startsWith(r1, r2, r0)
            return r1
    }

    private static boolean startsWith(java.lang.CharSequence r9, java.lang.CharSequence r10, boolean r11) {
            r0 = 0
            if (r9 == 0) goto L1f
            if (r10 != 0) goto L6
            goto L1f
        L6:
            int r1 = r10.length()
            int r2 = r9.length()
            if (r1 <= r2) goto L11
            return r0
        L11:
            r5 = 0
            r7 = 0
            int r8 = r10.length()
            r3 = r9
            r4 = r11
            r6 = r10
            boolean r9 = org.apache.commons.lang3.CharSequenceUtils.regionMatches(r3, r4, r5, r6, r7, r8)
            return r9
        L1f:
            if (r9 != r10) goto L22
            r0 = 1
        L22:
            return r0
    }

    public static boolean startsWithAny(java.lang.CharSequence r4, java.lang.CharSequence... r5) {
            boolean r0 = isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L1f
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r5)
            if (r0 == 0) goto Le
            goto L1f
        Le:
            int r0 = r5.length
            r2 = 0
        L10:
            if (r2 >= r0) goto L1f
            r3 = r5[r2]
            boolean r3 = startsWith(r4, r3)
            if (r3 == 0) goto L1c
            r4 = 1
            return r4
        L1c:
            int r2 = r2 + 1
            goto L10
        L1f:
            return r1
    }

    public static boolean startsWithIgnoreCase(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = 1
            boolean r1 = startsWith(r1, r2, r0)
            return r1
    }

    public static java.lang.String strip(java.lang.String r1) {
            r0 = 0
            java.lang.String r1 = strip(r1, r0)
            return r1
    }

    public static java.lang.String strip(java.lang.String r1, java.lang.String r2) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L7
            return r1
        L7:
            java.lang.String r1 = stripStart(r1, r2)
            java.lang.String r1 = stripEnd(r1, r2)
            return r1
    }

    public static java.lang.String stripAccents(java.lang.String r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.lang.String r0 = "\\p{InCombiningDiacriticalMarks}+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.text.Normalizer$Form r2 = java.text.Normalizer.Form.NFD
            java.lang.String r3 = java.text.Normalizer.normalize(r3, r2)
            r1.<init>(r3)
            convertRemainingAccentCharacters(r1)
            java.util.regex.Matcher r3 = r0.matcher(r1)
            java.lang.String r0 = ""
            java.lang.String r3 = r3.replaceAll(r0)
            return r3
    }

    public static java.lang.String[] stripAll(java.lang.String... r1) {
            r0 = 0
            java.lang.String[] r1 = stripAll(r1, r0)
            return r1
    }

    public static java.lang.String[] stripAll(java.lang.String[] r4, java.lang.String r5) {
            if (r4 == 0) goto L17
            int r0 = r4.length
            if (r0 != 0) goto L6
            goto L17
        L6:
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
        L9:
            if (r2 >= r0) goto L16
            r3 = r4[r2]
            java.lang.String r3 = strip(r3, r5)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L16:
            return r1
        L17:
            return r4
    }

    public static java.lang.String stripEnd(java.lang.String r3, java.lang.String r4) {
            if (r3 == 0) goto L3a
            int r0 = r3.length()
            if (r0 != 0) goto L9
            goto L3a
        L9:
            if (r4 != 0) goto L1c
        Lb:
            if (r0 == 0) goto L35
            int r4 = r0 + (-1)
            char r4 = r3.charAt(r4)
            boolean r4 = java.lang.Character.isWhitespace(r4)
            if (r4 == 0) goto L35
            int r0 = r0 + (-1)
            goto Lb
        L1c:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L23
            return r3
        L23:
            if (r0 == 0) goto L35
            int r1 = r0 + (-1)
            char r1 = r3.charAt(r1)
            int r1 = r4.indexOf(r1)
            r2 = -1
            if (r1 == r2) goto L35
            int r0 = r0 + (-1)
            goto L23
        L35:
            r4 = 0
            java.lang.String r3 = r3.substring(r4, r0)
        L3a:
            return r3
    }

    public static java.lang.String stripStart(java.lang.String r4, java.lang.String r5) {
            if (r4 == 0) goto L36
            int r0 = r4.length()
            if (r0 != 0) goto L9
            goto L36
        L9:
            r1 = 0
            if (r5 != 0) goto L1b
        Lc:
            if (r1 == r0) goto L32
            char r5 = r4.charAt(r1)
            boolean r5 = java.lang.Character.isWhitespace(r5)
            if (r5 == 0) goto L32
            int r1 = r1 + 1
            goto Lc
        L1b:
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L22
            return r4
        L22:
            if (r1 == r0) goto L32
            char r2 = r4.charAt(r1)
            int r2 = r5.indexOf(r2)
            r3 = -1
            if (r2 == r3) goto L32
            int r1 = r1 + 1
            goto L22
        L32:
            java.lang.String r4 = r4.substring(r1)
        L36:
            return r4
    }

    public static java.lang.String stripToEmpty(java.lang.String r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            goto La
        L5:
            r0 = 0
            java.lang.String r1 = strip(r1, r0)
        La:
            return r1
    }

    public static java.lang.String stripToNull(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = strip(r2, r0)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r0 = r2
        L10:
            return r0
    }

    public static java.lang.String substring(java.lang.String r1, int r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            if (r2 >= 0) goto Lb
            int r0 = r1.length()
            int r2 = r2 + r0
        Lb:
            if (r2 >= 0) goto Le
            r2 = 0
        Le:
            int r0 = r1.length()
            if (r2 <= r0) goto L17
            java.lang.String r1 = ""
            return r1
        L17:
            java.lang.String r1 = r1.substring(r2)
            return r1
    }

    public static java.lang.String substring(java.lang.String r1, int r2, int r3) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            if (r3 >= 0) goto Lb
            int r0 = r1.length()
            int r3 = r3 + r0
        Lb:
            if (r2 >= 0) goto L12
            int r0 = r1.length()
            int r2 = r2 + r0
        L12:
            int r0 = r1.length()
            if (r3 <= r0) goto L1c
            int r3 = r1.length()
        L1c:
            if (r2 <= r3) goto L21
            java.lang.String r1 = ""
            return r1
        L21:
            r0 = 0
            if (r2 >= 0) goto L25
            r2 = 0
        L25:
            if (r3 >= 0) goto L28
            r3 = 0
        L28:
            java.lang.String r1 = r1.substring(r2, r3)
            return r1
    }

    public static java.lang.String substringAfter(java.lang.String r3, java.lang.String r4) {
            boolean r0 = isEmpty(r3)
            if (r0 == 0) goto L7
            return r3
        L7:
            java.lang.String r0 = ""
            if (r4 != 0) goto Lc
            return r0
        Lc:
            int r1 = r3.indexOf(r4)
            r2 = -1
            if (r1 != r2) goto L14
            return r0
        L14:
            int r4 = r4.length()
            int r1 = r1 + r4
            java.lang.String r3 = r3.substring(r1)
            return r3
    }

    public static java.lang.String substringAfterLast(java.lang.String r4, java.lang.String r5) {
            boolean r0 = isEmpty(r4)
            if (r0 == 0) goto L7
            return r4
        L7:
            boolean r0 = isEmpty(r5)
            java.lang.String r1 = ""
            if (r0 == 0) goto L10
            return r1
        L10:
            int r0 = r4.lastIndexOf(r5)
            r2 = -1
            if (r0 == r2) goto L2d
            int r2 = r4.length()
            int r3 = r5.length()
            int r2 = r2 - r3
            if (r0 != r2) goto L23
            goto L2d
        L23:
            int r5 = r5.length()
            int r0 = r0 + r5
            java.lang.String r4 = r4.substring(r0)
            return r4
        L2d:
            return r1
    }

    public static java.lang.String substringBefore(java.lang.String r1, java.lang.String r2) {
            boolean r0 = isEmpty(r1)
            if (r0 != 0) goto L1f
            if (r2 != 0) goto L9
            goto L1f
        L9:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L12
            java.lang.String r1 = ""
            return r1
        L12:
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto L1a
            return r1
        L1a:
            r0 = 0
            java.lang.String r1 = r1.substring(r0, r2)
        L1f:
            return r1
    }

    public static java.lang.String substringBeforeLast(java.lang.String r1, java.lang.String r2) {
            boolean r0 = isEmpty(r1)
            if (r0 != 0) goto L1a
            boolean r0 = isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L1a
        Ld:
            int r2 = r1.lastIndexOf(r2)
            r0 = -1
            if (r2 != r0) goto L15
            return r1
        L15:
            r0 = 0
            java.lang.String r1 = r1.substring(r0, r2)
        L1a:
            return r1
    }

    public static java.lang.String substringBetween(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = substringBetween(r0, r1, r1)
            return r0
    }

    public static java.lang.String substringBetween(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r0 = 0
            if (r4 == 0) goto L24
            if (r5 == 0) goto L24
            if (r6 != 0) goto L8
            goto L24
        L8:
            int r1 = r4.indexOf(r5)
            r2 = -1
            if (r1 == r2) goto L24
            int r3 = r5.length()
            int r3 = r3 + r1
            int r6 = r4.indexOf(r6, r3)
            if (r6 == r2) goto L24
            int r5 = r5.length()
            int r1 = r1 + r5
            java.lang.String r4 = r4.substring(r1, r6)
            return r4
        L24:
            return r0
    }

    public static java.lang.String[] substringsBetween(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r0 = 0
            if (r7 == 0) goto L58
            boolean r1 = isEmpty(r8)
            if (r1 != 0) goto L58
            boolean r1 = isEmpty(r9)
            if (r1 == 0) goto L10
            goto L58
        L10:
            int r1 = r7.length()
            if (r1 != 0) goto L19
            java.lang.String[] r7 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            return r7
        L19:
            int r2 = r9.length()
            int r3 = r8.length()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
        L27:
            int r6 = r1 - r2
            if (r5 >= r6) goto L44
            int r5 = r7.indexOf(r8, r5)
            if (r5 >= 0) goto L32
            goto L44
        L32:
            int r5 = r5 + r3
            int r6 = r7.indexOf(r9, r5)
            if (r6 >= 0) goto L3a
            goto L44
        L3a:
            java.lang.String r5 = r7.substring(r5, r6)
            r4.add(r5)
            int r5 = r6 + r2
            goto L27
        L44:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L4b
            return r0
        L4b:
            int r7 = r4.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.Object[] r7 = r4.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            return r7
        L58:
            return r0
    }

    public static java.lang.String swapCase(java.lang.String r7) {
            boolean r0 = isEmpty(r7)
            if (r0 == 0) goto L7
            return r7
        L7:
            int r0 = r7.length()
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L10:
            if (r3 >= r0) goto L41
            int r5 = r7.codePointAt(r3)
            boolean r6 = java.lang.Character.isUpperCase(r5)
            if (r6 == 0) goto L21
            int r5 = java.lang.Character.toLowerCase(r5)
            goto L36
        L21:
            boolean r6 = java.lang.Character.isTitleCase(r5)
            if (r6 == 0) goto L2c
            int r5 = java.lang.Character.toLowerCase(r5)
            goto L36
        L2c:
            boolean r6 = java.lang.Character.isLowerCase(r5)
            if (r6 == 0) goto L36
            int r5 = java.lang.Character.toUpperCase(r5)
        L36:
            int r6 = r4 + 1
            r1[r4] = r5
            int r4 = java.lang.Character.charCount(r5)
            int r3 = r3 + r4
            r4 = r6
            goto L10
        L41:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2, r4)
            return r7
    }

    public static int[] toCodePoints(java.lang.CharSequence r5) {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            int r0 = r5.length()
            if (r0 != 0) goto Ld
            int[] r5 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY
            return r5
        Ld:
            java.lang.String r5 = r5.toString()
            int r0 = r5.length()
            r1 = 0
            int r0 = r5.codePointCount(r1, r0)
            int[] r2 = new int[r0]
            r3 = 0
        L1d:
            if (r1 >= r0) goto L2f
            int r4 = r5.codePointAt(r3)
            r2[r1] = r4
            r4 = r2[r1]
            int r4 = java.lang.Character.charCount(r4)
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L1d
        L2f:
            return r2
    }

    public static java.lang.String toEncodedString(byte[] r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = new java.lang.String
            if (r2 == 0) goto L5
            goto L9
        L5:
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()
        L9:
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String toString(byte[] r1, java.lang.String r2) throws java.io.UnsupportedEncodingException {
            java.lang.String r0 = new java.lang.String
            if (r2 == 0) goto L8
            r0.<init>(r1, r2)
            goto Lf
        L8:
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()
            r0.<init>(r1, r2)
        Lf:
            return r0
    }

    public static java.lang.String trim(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.lang.String r0 = r0.trim()
        L8:
            return r0
    }

    public static java.lang.String trimToEmpty(java.lang.String r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            goto L9
        L5:
            java.lang.String r0 = r0.trim()
        L9:
            return r0
    }

    public static java.lang.String trimToNull(java.lang.String r1) {
            java.lang.String r1 = trim(r1)
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto Lb
            r1 = 0
        Lb:
            return r1
    }

    public static java.lang.String truncate(java.lang.String r1, int r2) {
            r0 = 0
            java.lang.String r1 = truncate(r1, r0, r2)
            return r1
    }

    public static java.lang.String truncate(java.lang.String r1, int r2, int r3) {
            if (r2 < 0) goto L34
            if (r3 < 0) goto L2c
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r1.length()
            if (r2 <= r0) goto L11
            java.lang.String r1 = ""
            return r1
        L11:
            int r0 = r1.length()
            if (r0 <= r3) goto L27
            int r3 = r3 + r2
            int r0 = r1.length()
            if (r3 <= r0) goto L22
            int r3 = r1.length()
        L22:
            java.lang.String r1 = r1.substring(r2, r3)
            return r1
        L27:
            java.lang.String r1 = r1.substring(r2)
            return r1
        L2c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "maxWith cannot be negative"
            r1.<init>(r2)
            throw r1
        L34:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "offset cannot be negative"
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.String uncapitalize(java.lang.String r7) {
            if (r7 == 0) goto L34
            int r0 = r7.length()
            if (r0 != 0) goto L9
            goto L34
        L9:
            r1 = 0
            int r2 = r7.codePointAt(r1)
            int r3 = java.lang.Character.toLowerCase(r2)
            if (r2 != r3) goto L15
            return r7
        L15:
            int[] r4 = new int[r0]
            r4[r1] = r3
            int r2 = java.lang.Character.charCount(r2)
            r3 = 1
        L1e:
            if (r2 >= r0) goto L2f
            int r5 = r7.codePointAt(r2)
            int r6 = r3 + 1
            r4[r3] = r5
            int r3 = java.lang.Character.charCount(r5)
            int r2 = r2 + r3
            r3 = r6
            goto L1e
        L2f:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r4, r1, r3)
        L34:
            return r7
    }

    public static java.lang.String unwrap(java.lang.String r2, char r3) {
            boolean r0 = isEmpty(r2)
            if (r0 != 0) goto L28
            if (r3 != 0) goto L9
            goto L28
        L9:
            r0 = 0
            char r0 = r2.charAt(r0)
            if (r0 != r3) goto L28
            int r0 = r2.length()
            r1 = 1
            int r0 = r0 - r1
            char r0 = r2.charAt(r0)
            if (r0 != r3) goto L28
            int r3 = r2.length()
            int r3 = r3 - r1
            r0 = -1
            if (r3 == r0) goto L28
            java.lang.String r2 = r2.substring(r1, r3)
        L28:
            return r2
    }

    public static java.lang.String unwrap(java.lang.String r3, java.lang.String r4) {
            boolean r0 = isEmpty(r3)
            if (r0 != 0) goto L2f
            boolean r0 = isEmpty(r4)
            if (r0 == 0) goto Ld
            goto L2f
        Ld:
            boolean r0 = startsWith(r3, r4)
            if (r0 == 0) goto L2f
            boolean r0 = endsWith(r3, r4)
            if (r0 == 0) goto L2f
            int r0 = r3.indexOf(r4)
            int r1 = r3.lastIndexOf(r4)
            int r4 = r4.length()
            r2 = -1
            if (r0 == r2) goto L2f
            if (r1 == r2) goto L2f
            int r0 = r0 + r4
            java.lang.String r3 = r3.substring(r0, r1)
        L2f:
            return r3
    }

    public static java.lang.String upperCase(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = r0.toUpperCase()
            return r0
    }

    public static java.lang.String upperCase(java.lang.String r0, java.util.Locale r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = r0.toUpperCase(r1)
            return r0
    }

    public static java.lang.String valueOf(char[] r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L8:
            return r0
    }

    public static java.lang.String wrap(java.lang.String r1, char r2) {
            boolean r0 = isEmpty(r1)
            if (r0 != 0) goto L1b
            if (r2 != 0) goto L9
            goto L1b
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
        L1b:
            return r1
    }

    public static java.lang.String wrap(java.lang.String r1, java.lang.String r2) {
            boolean r0 = isEmpty(r1)
            if (r0 != 0) goto L15
            boolean r0 = isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r1 = r1.concat(r2)
        L15:
            return r1
    }

    public static java.lang.String wrapIfMissing(java.lang.String r2, char r3) {
            boolean r0 = isEmpty(r2)
            if (r0 != 0) goto L34
            if (r3 != 0) goto L9
            goto L34
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r2.length()
            int r1 = r1 + 2
            r0.<init>(r1)
            r1 = 0
            char r1 = r2.charAt(r1)
            if (r1 == r3) goto L1e
            r0.append(r3)
        L1e:
            r0.append(r2)
            int r1 = r2.length()
            int r1 = r1 + (-1)
            char r2 = r2.charAt(r1)
            if (r2 == r3) goto L30
            r0.append(r3)
        L30:
            java.lang.String r2 = r0.toString()
        L34:
            return r2
    }

    public static java.lang.String wrapIfMissing(java.lang.String r3, java.lang.String r4) {
            boolean r0 = isEmpty(r3)
            if (r0 != 0) goto L39
            boolean r0 = isEmpty(r4)
            if (r0 == 0) goto Ld
            goto L39
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            int r2 = r4.length()
            int r1 = r1 + r2
            int r2 = r4.length()
            int r1 = r1 + r2
            r0.<init>(r1)
            boolean r1 = r3.startsWith(r4)
            if (r1 != 0) goto L29
            r0.append(r4)
        L29:
            r0.append(r3)
            boolean r3 = r3.endsWith(r4)
            if (r3 != 0) goto L35
            r0.append(r4)
        L35:
            java.lang.String r3 = r0.toString()
        L39:
            return r3
    }
}
