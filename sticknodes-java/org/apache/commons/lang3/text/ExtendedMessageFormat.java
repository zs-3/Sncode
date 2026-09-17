package org.apache.commons.lang3.text;

@java.lang.Deprecated
/* loaded from: classes2.dex */
public class ExtendedMessageFormat extends java.text.MessageFormat {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String DUMMY_PATTERN = "";
    private static final char END_FE = '}';
    private static final int HASH_SEED = 31;
    private static final char QUOTE = '\'';
    private static final char START_FE = '{';
    private static final char START_FMT = ',';
    private static final long serialVersionUID = -2362048321261811743L;
    private final java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> registry;
    private java.lang.String toPattern;

    static {
            java.lang.Class<org.apache.commons.lang3.text.ExtendedMessageFormat> r0 = org.apache.commons.lang3.text.ExtendedMessageFormat.class
            return
    }

    public ExtendedMessageFormat(java.lang.String r2) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            r1.<init>(r2, r0)
            return
    }

    public ExtendedMessageFormat(java.lang.String r2, java.util.Locale r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ExtendedMessageFormat(java.lang.String r2, java.util.Locale r3, java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r4) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0)
            r1.setLocale(r3)
            r1.registry = r4
            r1.applyPattern(r2)
            return
    }

    public ExtendedMessageFormat(java.lang.String r2, java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r3) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            r1.<init>(r2, r0, r3)
            return
    }

    private java.lang.StringBuilder appendQuotedString(java.lang.String r6, java.text.ParsePosition r7, java.lang.StringBuilder r8) {
            r5 = this;
            r0 = 39
            if (r8 == 0) goto L7
            r8.append(r0)
        L7:
            r5.next(r7)
            int r1 = r7.getIndex()
            char[] r2 = r6.toCharArray()
            int r3 = r7.getIndex()
        L16:
            int r4 = r6.length()
            if (r3 >= r4) goto L3a
            int r4 = r7.getIndex()
            char r4 = r2[r4]
            if (r4 == r0) goto L2a
            r5.next(r7)
            int r3 = r3 + 1
            goto L16
        L2a:
            r5.next(r7)
            if (r8 != 0) goto L31
            r8 = 0
            goto L39
        L31:
            int r6 = r7.getIndex()
            int r6 = r6 - r1
            r8.append(r2, r1, r6)
        L39:
            return r8
        L3a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unterminated quoted string at position "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    private boolean containsElements(java.util.Collection<?> r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L1c
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La
            goto L1c
        La:
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto Le
            r3 = 1
            return r3
        L1c:
            return r0
    }

    private java.text.Format getFormat(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r0 = r3.registry
            r1 = 0
            if (r0 == 0) goto L37
            r0 = 44
            int r0 = r4.indexOf(r0)
            if (r0 <= 0) goto L23
            r2 = 0
            java.lang.String r2 = r4.substring(r2, r0)
            java.lang.String r2 = r2.trim()
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)
            java.lang.String r4 = r4.trim()
            r0 = r4
            r4 = r2
            goto L24
        L23:
            r0 = r1
        L24:
            java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r2 = r3.registry
            java.lang.Object r2 = r2.get(r4)
            org.apache.commons.lang3.text.FormatFactory r2 = (org.apache.commons.lang3.text.FormatFactory) r2
            if (r2 == 0) goto L37
            java.util.Locale r1 = r3.getLocale()
            java.text.Format r4 = r2.getFormat(r4, r0, r1)
            return r4
        L37:
            return r1
    }

    private void getQuotedString(java.lang.String r2, java.text.ParsePosition r3) {
            r1 = this;
            r0 = 0
            r1.appendQuotedString(r2, r3, r0)
            return
    }

    private java.lang.String insertFormats(java.lang.String r7, java.util.ArrayList<java.lang.String> r8) {
            r6 = this;
            boolean r0 = r6.containsElements(r8)
            if (r0 != 0) goto L7
            return r7
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r7.length()
            int r1 = r1 * 2
            r0.<init>(r1)
            java.text.ParsePosition r1 = new java.text.ParsePosition
            r2 = 0
            r1.<init>(r2)
            r3 = -1
        L19:
            int r4 = r1.getIndex()
            int r5 = r7.length()
            if (r4 >= r5) goto L6b
            int r4 = r1.getIndex()
            char r4 = r7.charAt(r4)
            r5 = 39
            if (r4 == r5) goto L67
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L41
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L38
            goto L3a
        L38:
            int r2 = r2 + (-1)
        L3a:
            r0.append(r4)
            r6.next(r1)
            goto L19
        L41:
            int r2 = r2 + 1
            r0.append(r5)
            java.text.ParsePosition r4 = r6.next(r1)
            int r4 = r6.readArgumentIndex(r7, r4)
            r0.append(r4)
            r4 = 1
            if (r2 != r4) goto L19
            int r3 = r3 + 1
            java.lang.Object r4 = r8.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L19
            r5 = 44
            r0.append(r5)
            r0.append(r4)
            goto L19
        L67:
            r6.appendQuotedString(r7, r1, r0)
            goto L19
        L6b:
            java.lang.String r7 = r0.toString()
            return r7
    }

    private java.text.ParsePosition next(java.text.ParsePosition r2) {
            r1 = this;
            int r0 = r2.getIndex()
            int r0 = r0 + 1
            r2.setIndex(r0)
            return r2
    }

    private java.lang.String parseFormatDescription(java.lang.String r6, java.text.ParsePosition r7) {
            r5 = this;
            int r0 = r7.getIndex()
            r5.seekNonWs(r6, r7)
            int r1 = r7.getIndex()
            r2 = 1
        Lc:
            int r3 = r7.getIndex()
            int r4 = r6.length()
            if (r3 >= r4) goto L42
            int r3 = r7.getIndex()
            char r3 = r6.charAt(r3)
            r4 = 39
            if (r3 == r4) goto L3b
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L38
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L2b
            goto L3e
        L2b:
            int r2 = r2 + (-1)
            if (r2 != 0) goto L3e
            int r7 = r7.getIndex()
            java.lang.String r6 = r6.substring(r1, r7)
            return r6
        L38:
            int r2 = r2 + 1
            goto L3e
        L3b:
            r5.getQuotedString(r6, r7)
        L3e:
            r5.next(r7)
            goto Lc
        L42:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Unterminated format element at position "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    private int readArgumentIndex(java.lang.String r8, java.text.ParsePosition r9) {
            r7 = this;
            int r0 = r9.getIndex()
            r7.seekNonWs(r8, r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
        Ld:
            if (r2 != 0) goto L5d
            int r3 = r9.getIndex()
            int r4 = r8.length()
            if (r3 >= r4) goto L5d
            int r2 = r9.getIndex()
            char r2 = r8.charAt(r2)
            boolean r3 = java.lang.Character.isWhitespace(r2)
            r4 = 1
            r5 = 125(0x7d, float:1.75E-43)
            r6 = 44
            if (r3 == 0) goto L3d
            r7.seekNonWs(r8, r9)
            int r2 = r9.getIndex()
            char r2 = r8.charAt(r2)
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L3d
            r2 = 1
            goto L59
        L3d:
            if (r2 == r6) goto L41
            if (r2 != r5) goto L50
        L41:
            int r3 = r1.length()
            if (r3 <= 0) goto L50
            java.lang.String r3 = r1.toString()     // Catch: java.lang.NumberFormatException -> L50
            int r8 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L50
            return r8
        L50:
            boolean r3 = java.lang.Character.isDigit(r2)
            r3 = r3 ^ r4
            r1.append(r2)
            r2 = r3
        L59:
            r7.next(r9)
            goto Ld
        L5d:
            if (r2 == 0) goto L86
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid format argument index at position "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ": "
            r2.append(r3)
            int r9 = r9.getIndex()
            java.lang.String r8 = r8.substring(r0, r9)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8)
            throw r1
        L86:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "Unterminated format element at position "
            r9.append(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    private void seekNonWs(java.lang.String r4, java.text.ParsePosition r5) {
            r3 = this;
            char[] r0 = r4.toCharArray()
        L4:
            org.apache.commons.lang3.text.StrMatcher r1 = org.apache.commons.lang3.text.StrMatcher.splitMatcher()
            int r2 = r5.getIndex()
            int r1 = r1.isMatch(r0, r2)
            int r2 = r5.getIndex()
            int r2 = r2 + r1
            r5.setIndex(r2)
            if (r1 <= 0) goto L24
            int r1 = r5.getIndex()
            int r2 = r4.length()
            if (r1 < r2) goto L4
        L24:
            return
    }

    @Override // java.text.MessageFormat
    public final void applyPattern(java.lang.String r13) {
            r12 = this;
            java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r0 = r12.registry
            if (r0 != 0) goto Le
            super.applyPattern(r13)
            java.lang.String r13 = super.toPattern()
            r12.toPattern = r13
            return
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r13.length()
            r2.<init>(r3)
            java.text.ParsePosition r3 = new java.text.ParsePosition
            r4 = 0
            r3.<init>(r4)
            char[] r5 = r13.toCharArray()
            r6 = 0
        L2c:
            int r7 = r3.getIndex()
            int r8 = r13.length()
            if (r7 >= r8) goto Ld7
            int r7 = r3.getIndex()
            char r7 = r5[r7]
            r8 = 39
            if (r7 == r8) goto Ld2
            r8 = 123(0x7b, float:1.72E-43)
            if (r7 == r8) goto L45
            goto Lad
        L45:
            int r6 = r6 + 1
            r12.seekNonWs(r13, r3)
            int r7 = r3.getIndex()
            java.text.ParsePosition r9 = r12.next(r3)
            int r9 = r12.readArgumentIndex(r13, r9)
            r2.append(r8)
            r2.append(r9)
            r12.seekNonWs(r13, r3)
            int r8 = r3.getIndex()
            char r8 = r5[r8]
            r9 = 44
            r10 = 0
            if (r8 != r9) goto L7f
            java.text.ParsePosition r8 = r12.next(r3)
            java.lang.String r8 = r12.parseFormatDescription(r13, r8)
            java.text.Format r11 = r12.getFormat(r8)
            if (r11 != 0) goto L81
            r2.append(r9)
            r2.append(r8)
            goto L81
        L7f:
            r8 = r10
            r11 = r8
        L81:
            r0.add(r11)
            if (r11 != 0) goto L87
            goto L88
        L87:
            r10 = r8
        L88:
            r1.add(r10)
            int r8 = r0.size()
            r9 = 1
            if (r8 != r6) goto L94
            r8 = 1
            goto L95
        L94:
            r8 = 0
        L95:
            org.apache.commons.lang3.Validate.isTrue(r8)
            int r8 = r1.size()
            if (r8 != r6) goto L9f
            goto La0
        L9f:
            r9 = 0
        La0:
            org.apache.commons.lang3.Validate.isTrue(r9)
            int r8 = r3.getIndex()
            char r8 = r5[r8]
            r9 = 125(0x7d, float:1.75E-43)
            if (r8 != r9) goto Lbb
        Lad:
            int r7 = r3.getIndex()
            char r7 = r5[r7]
            r2.append(r7)
            r12.next(r3)
            goto L2c
        Lbb:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unreadable format element at position "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        Ld2:
            r12.appendQuotedString(r13, r3, r2)
            goto L2c
        Ld7:
            java.lang.String r13 = r2.toString()
            super.applyPattern(r13)
            java.lang.String r13 = super.toPattern()
            java.lang.String r13 = r12.insertFormats(r13, r1)
            r12.toPattern = r13
            boolean r13 = r12.containsElements(r0)
            if (r13 == 0) goto L10c
            java.text.Format[] r13 = r12.getFormats()
            java.util.Iterator r0 = r0.iterator()
        Lf6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L109
            java.lang.Object r1 = r0.next()
            java.text.Format r1 = (java.text.Format) r1
            if (r1 == 0) goto L106
            r13[r4] = r1
        L106:
            int r4 = r4 + 1
            goto Lf6
        L109:
            super.setFormats(r13)
        L10c:
            return
    }

    @Override // java.text.MessageFormat
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = super.equals(r5)
            if (r2 != 0) goto Lf
            return r1
        Lf:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            boolean r2 = org.apache.commons.lang3.ObjectUtils.notEqual(r2, r3)
            if (r2 == 0) goto L1e
            return r1
        L1e:
            org.apache.commons.lang3.text.ExtendedMessageFormat r5 = (org.apache.commons.lang3.text.ExtendedMessageFormat) r5
            java.lang.String r2 = r4.toPattern
            java.lang.String r3 = r5.toPattern
            boolean r2 = org.apache.commons.lang3.ObjectUtils.notEqual(r2, r3)
            if (r2 == 0) goto L2b
            return r1
        L2b:
            java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r1 = r4.registry
            java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r5 = r5.registry
            boolean r5 = org.apache.commons.lang3.ObjectUtils.notEqual(r1, r5)
            r5 = r5 ^ r0
            return r5
    }

    @Override // java.text.MessageFormat
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            java.util.Map<java.lang.String, ? extends org.apache.commons.lang3.text.FormatFactory> r1 = r2.registry
            int r1 = java.util.Objects.hashCode(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.toPattern
            int r1 = java.util.Objects.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    @Override // java.text.MessageFormat
    public void setFormat(int r1, java.text.Format r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.text.MessageFormat
    public void setFormatByArgumentIndex(int r1, java.text.Format r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.text.MessageFormat
    public void setFormats(java.text.Format[] r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.text.MessageFormat
    public void setFormatsByArgumentIndex(java.text.Format[] r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.text.MessageFormat
    public java.lang.String toPattern() {
            r1 = this;
            java.lang.String r0 = r1.toPattern
            return r0
    }
}
