package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbaa {
    public static int zza(java.lang.String r2) {
            java.lang.String r0 = "UTF-8"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            goto Lb
        L7:
            byte[] r2 = r2.getBytes()
        Lb:
            int r0 = r2.length
            r1 = 0
            int r2 = com.google.android.gms.common.util.MurmurHash3.murmurhash3_x86_32(r2, r1, r0, r1)
            return r2
    }

    public static java.lang.String[] zzb(java.lang.String r11, boolean r12) {
            if (r11 != 0) goto L4
            r11 = 0
            return r11
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            char[] r1 = r11.toCharArray()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L11:
            int r6 = r11.length()
            if (r3 >= r6) goto L105
            int r6 = java.lang.Character.codePointAt(r1, r3)
            int r7 = java.lang.Character.charCount(r6)
            boolean r8 = java.lang.Character.isLetter(r6)
            r9 = 1
            if (r8 == 0) goto Lc6
            java.lang.Character$UnicodeBlock r8 = java.lang.Character.UnicodeBlock.of(r6)
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.BOPOMOFO
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lb0
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.BOPOMOFO_EXTENDED
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lb0
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lb0
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lb0
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lb0
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lb0
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lb0
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lb0
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lb0
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HANGUL_JAMO
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lb0
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HANGUL_SYLLABLES
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lb0
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HIRAGANA
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lb0
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.KATAKANA
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto Lb0
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L9b
            goto Lb0
        L9b:
            r8 = 65382(0xff66, float:9.162E-41)
            if (r6 < r8) goto La5
            r8 = 65437(0xff9d, float:9.1697E-41)
            if (r6 <= r8) goto Lb0
        La5:
            r8 = 65441(0xffa1, float:9.1702E-41)
            if (r6 < r8) goto Lc6
            r8 = 65500(0xffdc, float:9.1785E-41)
            if (r6 <= r8) goto Lb0
            goto Lc6
        Lb0:
            if (r4 == 0) goto Lbc
            int r4 = r3 - r5
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r5, r4)
            r0.add(r6)
        Lbc:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1, r3, r7)
            r0.add(r4)
        Lc4:
            r4 = 0
            goto L102
        Lc6:
            boolean r8 = java.lang.Character.isLetterOrDigit(r6)
            if (r8 != 0) goto Lfe
            int r8 = java.lang.Character.getType(r6)
            r10 = 6
            if (r8 == r10) goto Lfe
            int r8 = java.lang.Character.getType(r6)
            r10 = 8
            if (r8 != r10) goto Ldc
            goto Lfe
        Ldc:
            if (r12 == 0) goto Lf1
            int r8 = java.lang.Character.charCount(r6)
            if (r8 != r9) goto Lf1
            char[] r6 = java.lang.Character.toChars(r6)
            char r6 = r6[r2]
            r8 = 39
            if (r6 != r8) goto Lf1
            if (r9 == r4) goto L101
            goto L100
        Lf1:
            if (r4 == 0) goto Lc4
            int r4 = r3 - r5
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r5, r4)
            r0.add(r6)
            goto Lc4
        Lfe:
            if (r9 == r4) goto L101
        L100:
            r5 = r3
        L101:
            r4 = 1
        L102:
            int r3 = r3 + r7
            goto L11
        L105:
            if (r4 == 0) goto L110
            int r3 = r3 - r5
            java.lang.String r11 = new java.lang.String
            r11.<init>(r1, r5, r3)
            r0.add(r11)
        L110:
            int r11 = r0.size()
            java.lang.String[] r11 = new java.lang.String[r11]
            java.lang.Object[] r11 = r0.toArray(r11)
            java.lang.String[] r11 = (java.lang.String[]) r11
            return r11
    }
}
