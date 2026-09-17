package org.apache.commons.lang3.text.translate;

@java.lang.Deprecated
/* loaded from: classes2.dex */
public abstract class CharSequenceTranslator {
    static final char[] HEX_DIGITS = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.HEX_DIGITS = r0
            return
    }

    public CharSequenceTranslator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String hex(int r1) {
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toUpperCase(r0)
            return r1
    }

    public abstract int translate(java.lang.CharSequence r1, int r2, java.io.Writer r3) throws java.io.IOException;

    public final java.lang.String translate(java.lang.CharSequence r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.io.IOException -> L17
            int r1 = r3.length()     // Catch: java.io.IOException -> L17
            int r1 = r1 * 2
            r0.<init>(r1)     // Catch: java.io.IOException -> L17
            r2.translate(r3, r0)     // Catch: java.io.IOException -> L17
            java.lang.String r3 = r0.toString()     // Catch: java.io.IOException -> L17
            return r3
        L17:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
    }

    public final void translate(java.lang.CharSequence r7, java.io.Writer r8) throws java.io.IOException {
            r6 = this;
            if (r8 == 0) goto L44
            if (r7 != 0) goto L5
            return
        L5:
            int r0 = r7.length()
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L43
            int r3 = r6.translate(r7, r2, r8)
            if (r3 != 0) goto L34
            char r3 = r7.charAt(r2)
            r8.write(r3)
            int r2 = r2 + 1
            boolean r3 = java.lang.Character.isHighSurrogate(r3)
            if (r3 == 0) goto Lb
            if (r2 >= r0) goto Lb
            char r3 = r7.charAt(r2)
            boolean r4 = java.lang.Character.isLowSurrogate(r3)
            if (r4 == 0) goto Lb
            r8.write(r3)
            int r2 = r2 + 1
            goto Lb
        L34:
            r4 = 0
        L35:
            if (r4 >= r3) goto Lb
            int r5 = java.lang.Character.codePointAt(r7, r2)
            int r5 = java.lang.Character.charCount(r5)
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L35
        L43:
            return
        L44:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "The Writer must not be null"
            r7.<init>(r8)
            throw r7
    }

    public final org.apache.commons.lang3.text.translate.CharSequenceTranslator with(org.apache.commons.lang3.text.translate.CharSequenceTranslator... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 1
            int r0 = r0 + r1
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r0 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r0]
            r2 = 0
            r0[r2] = r4
            int r3 = r5.length
            java.lang.System.arraycopy(r5, r2, r0, r1, r3)
            org.apache.commons.lang3.text.translate.AggregateTranslator r5 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            r5.<init>(r0)
            return r5
    }
}
