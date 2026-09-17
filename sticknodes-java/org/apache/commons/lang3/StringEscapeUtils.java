package org.apache.commons.lang3;

@java.lang.Deprecated
/* loaded from: classes2.dex */
public class StringEscapeUtils {
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_CSV = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_ECMASCRIPT = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_HTML3 = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_HTML4 = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_JAVA = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_JSON = null;

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_XML = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_XML10 = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator ESCAPE_XML11 = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_CSV = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_ECMASCRIPT = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_HTML3 = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_HTML4 = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_JAVA = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_JSON = null;
    public static final org.apache.commons.lang3.text.translate.CharSequenceTranslator UNESCAPE_XML = null;

    static class CsvEscaper extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
        private static final char CSV_DELIMITER = ',';
        private static final char CSV_QUOTE = '\"';
        private static final java.lang.String CSV_QUOTE_STR = null;
        private static final char[] CSV_SEARCH_CHARS = null;

        static {
                r0 = 34
                java.lang.String r0 = java.lang.String.valueOf(r0)
                org.apache.commons.lang3.StringEscapeUtils.CsvEscaper.CSV_QUOTE_STR = r0
                r0 = 4
                char[] r0 = new char[r0]
                r0 = {x0012: FILL_ARRAY_DATA , data: [44, 34, 13, 10} // fill-array
                org.apache.commons.lang3.StringEscapeUtils.CsvEscaper.CSV_SEARCH_CHARS = r0
                return
        }

        CsvEscaper() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.text.translate.CharSequenceTranslator
        public int translate(java.lang.CharSequence r4, int r5, java.io.Writer r6) throws java.io.IOException {
                r3 = this;
                if (r5 != 0) goto L44
                java.lang.String r5 = r4.toString()
                char[] r0 = org.apache.commons.lang3.StringEscapeUtils.CsvEscaper.CSV_SEARCH_CHARS
                boolean r5 = org.apache.commons.lang3.StringUtils.containsNone(r5, r0)
                if (r5 == 0) goto L16
                java.lang.String r5 = r4.toString()
                r6.write(r5)
                goto L3a
            L16:
                r5 = 34
                r6.write(r5)
                java.lang.String r0 = r4.toString()
                java.lang.String r1 = org.apache.commons.lang3.StringEscapeUtils.CsvEscaper.CSV_QUOTE_STR
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = org.apache.commons.lang3.StringUtils.replace(r0, r1, r2)
                r6.write(r0)
                r6.write(r5)
            L3a:
                r5 = 0
                int r6 = r4.length()
                int r4 = java.lang.Character.codePointCount(r4, r5, r6)
                return r4
            L44:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "CsvEscaper should never reach the [1] index"
                r4.<init>(r5)
                throw r4
        }
    }

    static class CsvUnescaper extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
        private static final char CSV_DELIMITER = ',';
        private static final char CSV_QUOTE = '\"';
        private static final java.lang.String CSV_QUOTE_STR = null;
        private static final char[] CSV_SEARCH_CHARS = null;

        static {
                r0 = 34
                java.lang.String r0 = java.lang.String.valueOf(r0)
                org.apache.commons.lang3.StringEscapeUtils.CsvUnescaper.CSV_QUOTE_STR = r0
                r0 = 4
                char[] r0 = new char[r0]
                r0 = {x0012: FILL_ARRAY_DATA , data: [44, 34, 13, 10} // fill-array
                org.apache.commons.lang3.StringEscapeUtils.CsvUnescaper.CSV_SEARCH_CHARS = r0
                return
        }

        CsvUnescaper() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.text.translate.CharSequenceTranslator
        public int translate(java.lang.CharSequence r4, int r5, java.io.Writer r6) throws java.io.IOException {
                r3 = this;
                if (r5 != 0) goto L66
                r5 = 0
                char r0 = r4.charAt(r5)
                r1 = 34
                if (r0 != r1) goto L56
                int r0 = r4.length()
                r2 = 1
                int r0 = r0 - r2
                char r0 = r4.charAt(r0)
                if (r0 == r1) goto L18
                goto L56
            L18:
                int r0 = r4.length()
                int r0 = r0 - r2
                java.lang.CharSequence r0 = r4.subSequence(r2, r0)
                java.lang.String r0 = r0.toString()
                char[] r1 = org.apache.commons.lang3.StringEscapeUtils.CsvUnescaper.CSV_SEARCH_CHARS
                boolean r1 = org.apache.commons.lang3.StringUtils.containsAny(r0, r1)
                if (r1 == 0) goto L46
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = org.apache.commons.lang3.StringEscapeUtils.CsvUnescaper.CSV_QUOTE_STR
                r1.append(r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r0 = org.apache.commons.lang3.StringUtils.replace(r0, r1, r2)
                r6.write(r0)
                goto L4d
            L46:
                java.lang.String r0 = r4.toString()
                r6.write(r0)
            L4d:
                int r6 = r4.length()
                int r4 = java.lang.Character.codePointCount(r4, r5, r6)
                return r4
            L56:
                java.lang.String r0 = r4.toString()
                r6.write(r0)
                int r6 = r4.length()
                int r4 = java.lang.Character.codePointCount(r4, r5, r6)
                return r4
            L66:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "CsvUnescaper should never reach the [1] index"
                r4.<init>(r5)
                throw r4
        }
    }

    static {
            org.apache.commons.lang3.text.translate.LookupTranslator r0 = new org.apache.commons.lang3.text.translate.LookupTranslator
            r1 = 2
            java.lang.String[][] r2 = new java.lang.String[r1][]
            java.lang.String r3 = "\""
            java.lang.String r4 = "\\\""
            java.lang.String[] r5 = new java.lang.String[]{r3, r4}
            r6 = 0
            r2[r6] = r5
            java.lang.String r5 = "\\"
            java.lang.String r7 = "\\\\"
            java.lang.String[] r8 = new java.lang.String[]{r5, r7}
            r9 = 1
            r2[r9] = r8
            r0.<init>(r2)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r9]
            org.apache.commons.lang3.text.translate.LookupTranslator r8 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r10 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE()
            r8.<init>(r10)
            r2[r6] = r8
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = r0.with(r2)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r9]
            r8 = 32
            r10 = 127(0x7f, float:1.78E-43)
            org.apache.commons.lang3.text.translate.JavaUnicodeEscaper r11 = org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(r8, r10)
            r2[r6] = r11
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = r0.with(r2)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JAVA = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            r2 = 3
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r2]
            org.apache.commons.lang3.text.translate.LookupTranslator r12 = new org.apache.commons.lang3.text.translate.LookupTranslator
            r13 = 4
            java.lang.String[][] r14 = new java.lang.String[r13][]
            java.lang.String r15 = "'"
            java.lang.String r13 = "\\'"
            java.lang.String[] r17 = new java.lang.String[]{r15, r13}
            r14[r6] = r17
            java.lang.String[] r17 = new java.lang.String[]{r3, r4}
            r14[r9] = r17
            java.lang.String[] r17 = new java.lang.String[]{r5, r7}
            r14[r1] = r17
            java.lang.String r1 = "/"
            java.lang.String r8 = "\\/"
            java.lang.String[] r18 = new java.lang.String[]{r1, r8}
            r14[r2] = r18
            r12.<init>(r14)
            r11[r6] = r12
            org.apache.commons.lang3.text.translate.LookupTranslator r12 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r14 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE()
            r12.<init>(r14)
            r11[r9] = r12
            r12 = 32
            org.apache.commons.lang3.text.translate.JavaUnicodeEscaper r14 = org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(r12, r10)
            r12 = 2
            r11[r12] = r14
            r0.<init>(r11)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_ECMASCRIPT = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r11 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r2]
            org.apache.commons.lang3.text.translate.LookupTranslator r12 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r14 = new java.lang.String[r2][]
            java.lang.String[] r18 = new java.lang.String[]{r3, r4}
            r14[r6] = r18
            java.lang.String[] r18 = new java.lang.String[]{r5, r7}
            r14[r9] = r18
            java.lang.String[] r1 = new java.lang.String[]{r1, r8}
            r8 = 2
            r14[r8] = r1
            r12.<init>(r14)
            r11[r6] = r12
            org.apache.commons.lang3.text.translate.LookupTranslator r1 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r12 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE()
            r1.<init>(r12)
            r11[r9] = r1
            r1 = 32
            org.apache.commons.lang3.text.translate.JavaUnicodeEscaper r1 = org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(r1, r10)
            r11[r8] = r1
            r0.<init>(r11)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JSON = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r8]
            org.apache.commons.lang3.text.translate.LookupTranslator r8 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r11 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()
            r8.<init>(r11)
            r1[r6] = r8
            org.apache.commons.lang3.text.translate.LookupTranslator r8 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r11 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE()
            r8.<init>(r11)
            r1[r9] = r8
            r0.<init>(r1)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            r1 = 6
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r1]
            org.apache.commons.lang3.text.translate.LookupTranslator r11 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r12 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()
            r11.<init>(r12)
            r8[r6] = r11
            org.apache.commons.lang3.text.translate.LookupTranslator r11 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r12 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE()
            r11.<init>(r12)
            r8[r9] = r11
            org.apache.commons.lang3.text.translate.LookupTranslator r11 = new org.apache.commons.lang3.text.translate.LookupTranslator
            r12 = 31
            java.lang.String[][] r14 = new java.lang.String[r12][]
            java.lang.String r12 = "\u0000"
            java.lang.String r10 = ""
            java.lang.String[] r19 = new java.lang.String[]{r12, r10}
            r14[r6] = r19
            java.lang.String r6 = "\u0001"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r14[r9] = r6
            java.lang.String r6 = "\u0002"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r17 = 2
            r14[r17] = r6
            java.lang.String r6 = "\u0003"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r14[r2] = r6
            java.lang.String r6 = "\u0004"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r16 = 4
            r14[r16] = r6
            java.lang.String r6 = "\u0005"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r9 = 5
            r14[r9] = r6
            java.lang.String r6 = "\u0006"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r14[r1] = r6
            java.lang.String r6 = "\u0007"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r20 = 7
            r14[r20] = r6
            java.lang.String r6 = "\b"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r1 = 8
            r14[r1] = r6
            java.lang.String r6 = "\u000b"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 9
            r14[r21] = r6
            java.lang.String r6 = "\f"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 10
            r14[r21] = r6
            java.lang.String r6 = "\u000e"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 11
            r14[r21] = r6
            java.lang.String r6 = "\u000f"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 12
            r14[r21] = r6
            java.lang.String r6 = "\u0010"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 13
            r14[r21] = r6
            java.lang.String r6 = "\u0011"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 14
            r14[r21] = r6
            java.lang.String r6 = "\u0012"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 15
            r14[r21] = r6
            java.lang.String r6 = "\u0013"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 16
            r14[r21] = r6
            java.lang.String r6 = "\u0014"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 17
            r14[r21] = r6
            java.lang.String r6 = "\u0015"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 18
            r14[r21] = r6
            java.lang.String r6 = "\u0016"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 19
            r14[r21] = r6
            java.lang.String r6 = "\u0017"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 20
            r14[r21] = r6
            java.lang.String r6 = "\u0018"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 21
            r14[r21] = r6
            java.lang.String r6 = "\u0019"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 22
            r14[r21] = r6
            java.lang.String r6 = "\u001a"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 23
            r14[r21] = r6
            java.lang.String r6 = "\u001b"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 24
            r14[r21] = r6
            java.lang.String r6 = "\u001c"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 25
            r14[r21] = r6
            java.lang.String r6 = "\u001d"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 26
            r14[r21] = r6
            java.lang.String r6 = "\u001e"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 27
            r14[r21] = r6
            java.lang.String r6 = "\u001f"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 28
            r14[r21] = r6
            java.lang.String r6 = "\ufffe"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 29
            r14[r21] = r6
            java.lang.String r6 = "\uffff"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10}
            r21 = 30
            r14[r21] = r6
            r11.<init>(r14)
            r6 = 2
            r8[r6] = r11
            r6 = 132(0x84, float:1.85E-43)
            r11 = 127(0x7f, float:1.78E-43)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper r6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(r11, r6)
            r8[r2] = r6
            r6 = 134(0x86, float:1.88E-43)
            r11 = 159(0x9f, float:2.23E-43)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper r6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(r6, r11)
            r11 = 4
            r8[r11] = r6
            org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover r6 = new org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover
            r6.<init>()
            r8[r9] = r6
            r0.<init>(r8)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML10 = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r1]
            org.apache.commons.lang3.text.translate.LookupTranslator r8 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r11 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()
            r8.<init>(r11)
            r11 = 0
            r6[r11] = r8
            org.apache.commons.lang3.text.translate.LookupTranslator r8 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r14 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE()
            r8.<init>(r14)
            r14 = 1
            r6[r14] = r8
            org.apache.commons.lang3.text.translate.LookupTranslator r8 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r1 = new java.lang.String[r9][]
            java.lang.String[] r12 = new java.lang.String[]{r12, r10}
            r1[r11] = r12
            java.lang.String r11 = "\u000b"
            java.lang.String r12 = "&#11;"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12}
            r1[r14] = r11
            java.lang.String r11 = "\f"
            java.lang.String r12 = "&#12;"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12}
            r12 = 2
            r1[r12] = r11
            java.lang.String r11 = "\ufffe"
            java.lang.String[] r11 = new java.lang.String[]{r11, r10}
            r1[r2] = r11
            java.lang.String r11 = "\uffff"
            java.lang.String[] r11 = new java.lang.String[]{r11, r10}
            r14 = 4
            r1[r14] = r11
            r8.<init>(r1)
            r6[r12] = r8
            r1 = 8
            r8 = 1
            org.apache.commons.lang3.text.translate.NumericEntityEscaper r1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(r8, r1)
            r6[r2] = r1
            r1 = 14
            r8 = 31
            org.apache.commons.lang3.text.translate.NumericEntityEscaper r1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(r1, r8)
            r6[r14] = r1
            r1 = 132(0x84, float:1.85E-43)
            r8 = 127(0x7f, float:1.78E-43)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper r1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(r8, r1)
            r6[r9] = r1
            r1 = 134(0x86, float:1.88E-43)
            r8 = 159(0x9f, float:2.23E-43)
            org.apache.commons.lang3.text.translate.NumericEntityEscaper r1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(r1, r8)
            r8 = 6
            r6[r8] = r1
            org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover r1 = new org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover
            r1.<init>()
            r6[r20] = r1
            r0.<init>(r6)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML11 = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            r1 = 2
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r1]
            org.apache.commons.lang3.text.translate.LookupTranslator r1 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r8 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()
            r1.<init>(r8)
            r8 = 0
            r6[r8] = r1
            org.apache.commons.lang3.text.translate.LookupTranslator r1 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r8 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE()
            r1.<init>(r8)
            r8 = 1
            r6[r8] = r1
            r0.<init>(r6)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML3 = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r2]
            org.apache.commons.lang3.text.translate.LookupTranslator r6 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r8 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE()
            r6.<init>(r8)
            r8 = 0
            r1[r8] = r6
            org.apache.commons.lang3.text.translate.LookupTranslator r6 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r8 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE()
            r6.<init>(r8)
            r8 = 1
            r1[r8] = r6
            org.apache.commons.lang3.text.translate.LookupTranslator r6 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r8 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE()
            r6.<init>(r8)
            r8 = 2
            r1[r8] = r6
            r0.<init>(r1)
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML4 = r0
            org.apache.commons.lang3.StringEscapeUtils$CsvEscaper r0 = new org.apache.commons.lang3.StringEscapeUtils$CsvEscaper
            r0.<init>()
            org.apache.commons.lang3.StringEscapeUtils.ESCAPE_CSV = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            r1 = 4
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r1]
            org.apache.commons.lang3.text.translate.OctalUnescaper r1 = new org.apache.commons.lang3.text.translate.OctalUnescaper
            r1.<init>()
            r8 = 0
            r6[r8] = r1
            org.apache.commons.lang3.text.translate.UnicodeUnescaper r1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper
            r1.<init>()
            r9 = 1
            r6[r9] = r1
            org.apache.commons.lang3.text.translate.LookupTranslator r1 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r11 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE()
            r1.<init>(r11)
            r11 = 2
            r6[r11] = r1
            org.apache.commons.lang3.text.translate.LookupTranslator r1 = new org.apache.commons.lang3.text.translate.LookupTranslator
            r12 = 4
            java.lang.String[][] r14 = new java.lang.String[r12][]
            java.lang.String[] r7 = new java.lang.String[]{r7, r5}
            r14[r8] = r7
            java.lang.String[] r3 = new java.lang.String[]{r4, r3}
            r14[r9] = r3
            java.lang.String[] r3 = new java.lang.String[]{r13, r15}
            r14[r11] = r3
            java.lang.String[] r3 = new java.lang.String[]{r5, r10}
            r14[r2] = r3
            r1.<init>(r14)
            r6[r2] = r1
            r0.<init>(r6)
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JAVA = r0
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_ECMASCRIPT = r0
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JSON = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r2]
            org.apache.commons.lang3.text.translate.LookupTranslator r3 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r4 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE()
            r3.<init>(r4)
            r4 = 0
            r1[r4] = r3
            org.apache.commons.lang3.text.translate.LookupTranslator r3 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r5 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE()
            r3.<init>(r5)
            r5 = 1
            r1[r5] = r3
            org.apache.commons.lang3.text.translate.NumericEntityUnescaper r3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper
            org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION[] r5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[r4]
            r3.<init>(r5)
            r5 = 2
            r1[r5] = r3
            r0.<init>(r1)
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML3 = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            r1 = 4
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r1]
            org.apache.commons.lang3.text.translate.LookupTranslator r3 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r5 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE()
            r3.<init>(r5)
            r1[r4] = r3
            org.apache.commons.lang3.text.translate.LookupTranslator r3 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r5 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE()
            r3.<init>(r5)
            r5 = 1
            r1[r5] = r3
            org.apache.commons.lang3.text.translate.LookupTranslator r3 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r5 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_UNESCAPE()
            r3.<init>(r5)
            r5 = 2
            r1[r5] = r3
            org.apache.commons.lang3.text.translate.NumericEntityUnescaper r3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper
            org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION[] r5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[r4]
            r3.<init>(r5)
            r1[r2] = r3
            r0.<init>(r1)
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML4 = r0
            org.apache.commons.lang3.text.translate.AggregateTranslator r0 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r2]
            org.apache.commons.lang3.text.translate.LookupTranslator r2 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r3 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE()
            r2.<init>(r3)
            r1[r4] = r2
            org.apache.commons.lang3.text.translate.LookupTranslator r2 = new org.apache.commons.lang3.text.translate.LookupTranslator
            java.lang.String[][] r3 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE()
            r2.<init>(r3)
            r3 = 1
            r1[r3] = r2
            org.apache.commons.lang3.text.translate.NumericEntityUnescaper r2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper
            org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION[] r3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[r4]
            r2.<init>(r3)
            r3 = 2
            r1[r3] = r2
            r0.<init>(r1)
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_XML = r0
            org.apache.commons.lang3.StringEscapeUtils$CsvUnescaper r0 = new org.apache.commons.lang3.StringEscapeUtils$CsvUnescaper
            r0.<init>()
            org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_CSV = r0
            return
    }

    public StringEscapeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.lang.String escapeCsv(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_CSV
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String escapeEcmaScript(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_ECMASCRIPT
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String escapeHtml3(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML3
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String escapeHtml4(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_HTML4
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String escapeJava(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JAVA
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String escapeJson(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_JSON
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    @java.lang.Deprecated
    public static final java.lang.String escapeXml(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static java.lang.String escapeXml10(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML10
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static java.lang.String escapeXml11(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.ESCAPE_XML11
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeCsv(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_CSV
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeEcmaScript(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_ECMASCRIPT
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeHtml3(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML3
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeHtml4(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_HTML4
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeJava(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JAVA
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeJson(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_JSON
            java.lang.String r1 = r0.translate(r1)
            return r1
    }

    public static final java.lang.String unescapeXml(java.lang.String r1) {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator r0 = org.apache.commons.lang3.StringEscapeUtils.UNESCAPE_XML
            java.lang.String r1 = r0.translate(r1)
            return r1
    }
}
