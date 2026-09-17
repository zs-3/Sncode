package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class FastParser<T extends com.google.android.gms.common.server.response.FastJsonResponse> {
    private static final char[] zaa = null;
    private static final char[] zab = null;
    private static final char[] zac = null;
    private static final char[] zad = null;
    private static final char[] zae = null;
    private static final char[] zaf = null;
    private static final com.google.android.gms.common.server.response.zai zag = null;
    private static final com.google.android.gms.common.server.response.zai zah = null;
    private static final com.google.android.gms.common.server.response.zai zai = null;
    private static final com.google.android.gms.common.server.response.zai zaj = null;
    private static final com.google.android.gms.common.server.response.zai zak = null;
    private static final com.google.android.gms.common.server.response.zai zal = null;
    private static final com.google.android.gms.common.server.response.zai zam = null;
    private static final com.google.android.gms.common.server.response.zai zan = null;
    private final char[] zao;
    private final char[] zap;
    private final char[] zaq;
    private final java.lang.StringBuilder zar;
    private final java.lang.StringBuilder zas;
    private final java.util.Stack zat;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class ParseException extends java.lang.Exception {
        public ParseException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public ParseException(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                java.lang.String r1 = "Error instantiating inner object"
                r0.<init>(r1, r2)
                return
        }

        public ParseException(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            r0 = 3
            char[] r1 = new char[r0]
            r1 = {x006a: FILL_ARRAY_DATA , data: [117, 108, 108} // fill-array
            com.google.android.gms.common.server.response.FastParser.zaa = r1
            char[] r0 = new char[r0]
            r0 = {x0072: FILL_ARRAY_DATA , data: [114, 117, 101} // fill-array
            com.google.android.gms.common.server.response.FastParser.zab = r0
            r0 = 4
            char[] r1 = new char[r0]
            r1 = {x007a: FILL_ARRAY_DATA , data: [114, 117, 101, 34} // fill-array
            com.google.android.gms.common.server.response.FastParser.zac = r1
            char[] r0 = new char[r0]
            r0 = {x0082: FILL_ARRAY_DATA , data: [97, 108, 115, 101} // fill-array
            com.google.android.gms.common.server.response.FastParser.zad = r0
            r0 = 5
            char[] r0 = new char[r0]
            r0 = {x008a: FILL_ARRAY_DATA , data: [97, 108, 115, 101, 34} // fill-array
            com.google.android.gms.common.server.response.FastParser.zae = r0
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 10
            r0[r1] = r2
            com.google.android.gms.common.server.response.FastParser.zaf = r0
            com.google.android.gms.common.server.response.zaa r0 = new com.google.android.gms.common.server.response.zaa
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zag = r0
            com.google.android.gms.common.server.response.zab r0 = new com.google.android.gms.common.server.response.zab
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zah = r0
            com.google.android.gms.common.server.response.zac r0 = new com.google.android.gms.common.server.response.zac
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zai = r0
            com.google.android.gms.common.server.response.zad r0 = new com.google.android.gms.common.server.response.zad
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zaj = r0
            com.google.android.gms.common.server.response.zae r0 = new com.google.android.gms.common.server.response.zae
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zak = r0
            com.google.android.gms.common.server.response.zaf r0 = new com.google.android.gms.common.server.response.zaf
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zal = r0
            com.google.android.gms.common.server.response.zag r0 = new com.google.android.gms.common.server.response.zag
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zam = r0
            com.google.android.gms.common.server.response.zah r0 = new com.google.android.gms.common.server.response.zah
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zan = r0
            return
    }

    public FastParser() {
            r3 = this;
            r3.<init>()
            r0 = 1
            char[] r0 = new char[r0]
            r3.zao = r0
            r0 = 32
            char[] r1 = new char[r0]
            r3.zap = r1
            r1 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r1]
            r3.zaq = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r3.zar = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r3.zas = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r3.zat = r0
            return
    }

    private static final java.lang.String zaA(java.io.BufferedReader r8, char[] r9, java.lang.StringBuilder r10, char[] r11) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r0 = 0
            r10.setLength(r0)
            int r1 = r9.length
            r8.mark(r1)
            r1 = 0
            r2 = 0
        La:
            int r3 = r8.read(r9)
            r4 = -1
            if (r3 == r4) goto L60
            r4 = 0
        L12:
            if (r4 >= r3) goto L58
            char r5 = r9[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            if (r6 == 0) goto L2b
            if (r11 == 0) goto L23
            char r6 = r11[r0]
            if (r6 != r5) goto L23
            goto L2b
        L23:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected control character while reading string"
            r8.<init>(r9)
            throw r8
        L2b:
            int r6 = r4 + 1
            r7 = 34
            if (r5 != r7) goto L4d
            if (r1 != 0) goto L55
            r10.append(r9, r0, r4)
            r8.reset()
            long r0 = (long) r6
            r8.skip(r0)
            if (r2 == 0) goto L48
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = com.google.android.gms.common.util.JsonUtils.unescapeString(r8)
            return r8
        L48:
            java.lang.String r8 = r10.toString()
            return r8
        L4d:
            r4 = 92
            if (r5 != r4) goto L55
            r1 = r1 ^ 1
            r2 = 1
            goto L56
        L55:
            r1 = 0
        L56:
            r4 = r6
            goto L12
        L58:
            r10.append(r9, r0, r3)
            int r3 = r9.length
            r8.mark(r3)
            goto La
        L60:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected EOF while parsing string"
            r8.<init>(r9)
            throw r8
    }

    static /* bridge */ /* synthetic */ double zaa(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            double r0 = r0.zaj(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ float zab(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            float r0 = r0.zak(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ int zac(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            int r0 = r0.zal(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ long zad(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            long r0 = r0.zan(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zae(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            java.lang.String r0 = r0.zao(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ java.math.BigDecimal zaf(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            java.math.BigDecimal r0 = r0.zas(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ java.math.BigInteger zag(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            java.math.BigInteger r0 = r0.zat(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zah(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1, boolean r2) {
            r2 = 0
            boolean r0 = r0.zay(r1, r2)
            return r0
    }

    private final char zai(java.io.BufferedReader r4) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = r3.zao
            int r0 = r4.read(r0)
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L22
        La:
            char[] r0 = r3.zao
            char r0 = r0[r2]
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L1d
            char[] r0 = r3.zao
            int r0 = r4.read(r0)
            if (r0 != r1) goto La
            goto L22
        L1d:
            char[] r4 = r3.zao
            char r4 = r4[r2]
            return r4
        L22:
            return r2
    }

    private final double zaj(java.io.BufferedReader r4) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = r3.zaq
            int r4 = r3.zam(r4, r0)
            if (r4 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            char[] r0 = r3.zaq
            java.lang.String r1 = new java.lang.String
            r2 = 0
            r1.<init>(r0, r2, r4)
            double r0 = java.lang.Double.parseDouble(r1)
            return r0
    }

    private final float zak(java.io.BufferedReader r4) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = r3.zaq
            int r4 = r3.zam(r4, r0)
            if (r4 != 0) goto La
            r4 = 0
            return r4
        La:
            char[] r0 = r3.zaq
            java.lang.String r1 = new java.lang.String
            r2 = 0
            r1.<init>(r0, r2, r4)
            float r4 = java.lang.Float.parseFloat(r1)
            return r4
    }

    private final int zal(java.io.BufferedReader r12) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r11 = this;
            char[] r0 = r11.zaq
            int r12 = r11.zam(r12, r0)
            r0 = 0
            if (r12 != 0) goto La
            return r0
        La:
            char[] r1 = r11.zaq
            if (r12 <= 0) goto L77
            char r2 = r1[r0]
            r3 = 45
            if (r2 != r3) goto L17
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L1a
        L17:
            r4 = -2147483647(0xffffffff80000001, float:-1.4E-45)
        L1a:
            r5 = 1
            if (r2 != r3) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            java.lang.String r3 = "Unexpected non-digit character"
            r6 = 10
            if (r2 >= r12) goto L38
            int r0 = r2 + 1
            char r7 = r1[r2]
            int r7 = java.lang.Character.digit(r7, r6)
            if (r7 < 0) goto L32
            int r7 = -r7
            goto L3a
        L32:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r3)
            throw r12
        L38:
            r0 = r2
            r7 = 0
        L3a:
            if (r0 >= r12) goto L68
            int r8 = r0 + 1
            char r0 = r1[r0]
            int r0 = java.lang.Character.digit(r0, r6)
            if (r0 < 0) goto L62
            r9 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            java.lang.String r10 = "Number too large"
            if (r7 < r9) goto L5c
            int r7 = r7 * 10
            int r9 = r4 + r0
            if (r7 < r9) goto L56
            int r7 = r7 - r0
            r0 = r8
            goto L3a
        L56:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r10)
            throw r12
        L5c:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r10)
            throw r12
        L62:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r3)
            throw r12
        L68:
            if (r2 == 0) goto L75
            if (r0 <= r5) goto L6d
            goto L76
        L6d:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "No digits to parse"
            r12.<init>(r0)
            throw r12
        L75:
            int r7 = -r7
        L76:
            return r7
        L77:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "No number to parse"
            r12.<init>(r0)
            throw r12
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final int zam(java.io.BufferedReader r11, char[] r12) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r10 = this;
            char r0 = r10.zai(r11)
            java.lang.String r1 = "Unexpected EOF"
            if (r0 == 0) goto L9d
            r2 = 44
            if (r0 == r2) goto L95
            r3 = 110(0x6e, float:1.54E-43)
            r4 = 0
            if (r0 != r3) goto L17
            char[] r12 = com.google.android.gms.common.server.response.FastParser.zaa
            r10.zax(r11, r12)
            return r4
        L17:
            r3 = 1024(0x400, float:1.435E-42)
            r11.mark(r3)
            r5 = 34
            r6 = -1
            r7 = 1
            if (r0 != r5) goto L56
            r0 = 0
            r2 = 0
        L24:
            if (r0 >= r3) goto L85
            int r8 = r11.read(r12, r0, r7)
            if (r8 == r6) goto L85
            char r8 = r12[r0]
            boolean r9 = java.lang.Character.isISOControl(r8)
            if (r9 != 0) goto L4e
            int r9 = r0 + 1
            if (r8 != r5) goto L43
            if (r2 == 0) goto L3b
            goto L4b
        L3b:
            r11.reset()
            long r1 = (long) r9
            r11.skip(r1)
            return r0
        L43:
            r0 = 92
            if (r8 != r0) goto L4b
            r0 = r2 ^ 1
            r2 = r0
            goto L4c
        L4b:
            r2 = 0
        L4c:
            r0 = r9
            goto L24
        L4e:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r12 = "Unexpected control character while reading string"
            r11.<init>(r12)
            throw r11
        L56:
            r12[r4] = r0
            r0 = 1
        L59:
            if (r0 >= r3) goto L85
            int r5 = r11.read(r12, r0, r7)
            if (r5 == r6) goto L85
            char r5 = r12[r0]
            r8 = 125(0x7d, float:1.75E-43)
            if (r5 == r8) goto L79
            if (r5 == r2) goto L79
            boolean r5 = java.lang.Character.isWhitespace(r5)
            if (r5 != 0) goto L79
            char r5 = r12[r0]
            r8 = 93
            if (r5 != r8) goto L76
            goto L79
        L76:
            int r0 = r0 + 1
            goto L59
        L79:
            r11.reset()
            int r1 = r0 + (-1)
            long r1 = (long) r1
            r11.skip(r1)
            r12[r0] = r4
            return r0
        L85:
            if (r0 != r3) goto L8f
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r12 = "Absurdly long value"
            r11.<init>(r12)
            throw r11
        L8f:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r11.<init>(r1)
            throw r11
        L95:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r12 = "Missing value"
            r11.<init>(r12)
            throw r11
        L9d:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r11.<init>(r1)
            throw r11
    }

    private final long zan(java.io.BufferedReader r19) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r18 = this;
            r0 = r18
            char[] r1 = r0.zaq
            r2 = r19
            int r1 = r0.zam(r2, r1)
            r2 = 0
            if (r1 != 0) goto Lf
            return r2
        Lf:
            char[] r4 = r0.zaq
            if (r1 <= 0) goto L87
            r5 = 0
            char r6 = r4[r5]
            r7 = 45
            if (r6 != r7) goto L1d
            r8 = -9223372036854775808
            goto L22
        L1d:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L22:
            r10 = 1
            if (r6 != r7) goto L26
            r5 = 1
        L26:
            java.lang.String r6 = "Unexpected non-digit character"
            r7 = 10
            if (r5 >= r1) goto L3f
            int r2 = r5 + 1
            char r3 = r4[r5]
            int r3 = java.lang.Character.digit(r3, r7)
            if (r3 < 0) goto L39
            int r3 = -r3
            long r11 = (long) r3
            goto L41
        L39:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r6)
            throw r1
        L3f:
            r11 = r2
            r2 = r5
        L41:
            if (r2 >= r1) goto L78
            int r3 = r2 + 1
            char r2 = r4[r2]
            int r2 = java.lang.Character.digit(r2, r7)
            if (r2 < 0) goto L72
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            java.lang.String r15 = "Number too large"
            int r16 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r16 < 0) goto L6c
            r13 = 10
            long r11 = r11 * r13
            long r13 = (long) r2
            long r16 = r8 + r13
            int r2 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r2 < 0) goto L66
            long r11 = r11 - r13
            r2 = r3
            goto L41
        L66:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r15)
            throw r1
        L6c:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r15)
            throw r1
        L72:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r6)
            throw r1
        L78:
            if (r5 == 0) goto L85
            if (r2 <= r10) goto L7d
            goto L86
        L7d:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "No digits to parse"
            r1.<init>(r2)
            throw r1
        L85:
            long r11 = -r11
        L86:
            return r11
        L87:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "No number to parse"
            r1.<init>(r2)
            throw r1
    }

    private final java.lang.String zao(java.io.BufferedReader r4) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = r3.zap
            java.lang.StringBuilder r1 = r3.zar
            r2 = 0
            java.lang.String r4 = r3.zap(r4, r0, r1, r2)
            return r4
    }

    private final java.lang.String zap(java.io.BufferedReader r3, char[] r4, java.lang.StringBuilder r5, char[] r6) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r2 = this;
            char r0 = r2.zai(r3)
            r1 = 34
            if (r0 == r1) goto L1b
            r4 = 110(0x6e, float:1.54E-43)
            if (r0 != r4) goto L13
            char[] r4 = com.google.android.gms.common.server.response.FastParser.zaa
            r2.zax(r3, r4)
            r3 = 0
            return r3
        L13:
            com.google.android.gms.common.server.response.FastParser$ParseException r3 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r4 = "Expected string"
            r3.<init>(r4)
            throw r3
        L1b:
            java.lang.String r3 = zaA(r3, r4, r5, r6)
            return r3
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final java.lang.String zaq(java.io.BufferedReader r5) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            java.util.Stack r0 = r4.zat
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.push(r2)
            char r0 = r4.zai(r5)
            r2 = 34
            r3 = 0
            if (r0 == r2) goto L42
            r5 = 93
            if (r0 == r5) goto L36
            r5 = 125(0x7d, float:1.75E-43)
            if (r0 != r5) goto L1f
            r4.zaw(r1)
            return r3
        L1f:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected token: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L36:
            r4.zaw(r1)
            r5 = 1
            r4.zaw(r5)
            r5 = 5
            r4.zaw(r5)
            return r3
        L42:
            java.util.Stack r0 = r4.zat
            r1 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.push(r2)
            char[] r0 = r4.zap
            java.lang.StringBuilder r2 = r4.zar
            java.lang.String r0 = zaA(r5, r0, r2, r3)
            r4.zaw(r1)
            char r5 = r4.zai(r5)
            r1 = 58
            if (r5 != r1) goto L60
            return r0
        L60:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "Expected key/value separator"
            r5.<init>(r0)
            throw r5
    }

    private final java.lang.String zar(java.io.BufferedReader r15) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r14 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r15.mark(r0)
            char r0 = r14.zai(r15)
            r1 = 92
            java.lang.String r2 = "Unexpected token "
            r3 = 125(0x7d, float:1.75E-43)
            r4 = 44
            r5 = 34
            r6 = 0
            r7 = 1
            if (r0 == r5) goto Ld1
            if (r0 == r4) goto Lc9
            r8 = 32
            r9 = 91
            if (r0 == r9) goto L6c
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L2d
            r15.reset()
            char[] r0 = r14.zaq
            r14.zam(r15, r0)
            goto Le9
        L2d:
            java.util.Stack r0 = r14.zat
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.push(r1)
            r15.mark(r8)
            char r0 = r14.zai(r15)
            if (r0 != r3) goto L44
            r14.zaw(r7)
            goto Le9
        L44:
            if (r0 != r5) goto L57
            r15.reset()
            r14.zaq(r15)
        L4c:
            java.lang.String r0 = r14.zar(r15)
            if (r0 != 0) goto L4c
            r14.zaw(r7)
            goto Le9
        L57:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L6c:
            java.util.Stack r0 = r14.zat
            r10 = 5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r0.push(r11)
            r15.mark(r8)
            char r0 = r14.zai(r15)
            r8 = 93
            if (r0 != r8) goto L85
            r14.zaw(r10)
            goto Le9
        L85:
            r15.reset()
            r0 = 0
        L89:
            r11 = 0
        L8a:
            if (r7 <= 0) goto Lc5
            char r12 = r14.zai(r15)
            if (r12 == 0) goto Lbd
            boolean r13 = java.lang.Character.isISOControl(r12)
            if (r13 != 0) goto Lb5
            if (r12 != r5) goto La0
            if (r11 != 0) goto L9e
            r0 = r0 ^ 1
        L9e:
            r12 = 34
        La0:
            if (r12 != r9) goto La8
            if (r0 != 0) goto La6
            int r7 = r7 + 1
        La6:
            r12 = 91
        La8:
            if (r12 != r8) goto Lae
            if (r0 != 0) goto Lae
            int r7 = r7 + (-1)
        Lae:
            if (r12 != r1) goto L89
            if (r0 == 0) goto L89
            r11 = r11 ^ 1
            goto L8a
        Lb5:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "Unexpected control character while reading array"
            r15.<init>(r0)
            throw r15
        Lbd:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "Unexpected EOF while parsing array"
            r15.<init>(r0)
            throw r15
        Lc5:
            r14.zaw(r10)
            goto Le9
        Lc9:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "Missing value"
            r15.<init>(r0)
            throw r15
        Ld1:
            char[] r0 = r14.zao
            int r0 = r15.read(r0)
            java.lang.String r8 = "Unexpected EOF while parsing string"
            r9 = -1
            if (r0 == r9) goto L13c
            char[] r0 = r14.zao
            char r0 = r0[r6]
            r10 = 0
        Le1:
            if (r0 != r5) goto L114
            if (r10 == 0) goto Le9
            r0 = 34
            r10 = 1
            goto L114
        Le9:
            char r0 = r14.zai(r15)
            r1 = 2
            if (r0 == r4) goto L10c
            if (r0 != r3) goto Lf7
            r14.zaw(r1)
            r15 = 0
            return r15
        Lf7:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L10c:
            r14.zaw(r1)
            java.lang.String r15 = r14.zaq(r15)
            return r15
        L114:
            if (r0 != r1) goto L11a
            r0 = r10 ^ 1
            r10 = r0
            goto L11b
        L11a:
            r10 = 0
        L11b:
            char[] r0 = r14.zao
            int r0 = r15.read(r0)
            if (r0 == r9) goto L136
            char[] r0 = r14.zao
            char r0 = r0[r6]
            boolean r11 = java.lang.Character.isISOControl(r0)
            if (r11 != 0) goto L12e
            goto Le1
        L12e:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "Unexpected control character while reading string"
            r15.<init>(r0)
            throw r15
        L136:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r15.<init>(r8)
            throw r15
        L13c:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r15.<init>(r8)
            throw r15
    }

    private final java.math.BigDecimal zas(java.io.BufferedReader r5) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            char[] r0 = r4.zaq
            int r5 = r4.zam(r5, r0)
            if (r5 != 0) goto La
            r5 = 0
            return r5
        La:
            char[] r0 = r4.zaq
            java.math.BigDecimal r1 = new java.math.BigDecimal
            java.lang.String r2 = new java.lang.String
            r3 = 0
            r2.<init>(r0, r3, r5)
            r1.<init>(r2)
            return r1
    }

    private final java.math.BigInteger zat(java.io.BufferedReader r5) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            char[] r0 = r4.zaq
            int r5 = r4.zam(r5, r0)
            if (r5 != 0) goto La
            r5 = 0
            return r5
        La:
            char[] r0 = r4.zaq
            java.math.BigInteger r1 = new java.math.BigInteger
            java.lang.String r2 = new java.lang.String
            r3 = 0
            r2.<init>(r0, r3, r5)
            r1.<init>(r2)
            return r1
    }

    private final java.util.ArrayList zau(java.io.BufferedReader r5, com.google.android.gms.common.server.response.zai r6) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            char r0 = r4.zai(r5)
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto Lf
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zaa
            r4.zax(r5, r6)
            r5 = 0
            return r5
        Lf:
            r1 = 91
            if (r0 != r1) goto L4c
            java.util.Stack r0 = r4.zat
            r1 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.push(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L22:
            r2 = 1024(0x400, float:1.435E-42)
            r5.mark(r2)
            char r2 = r4.zai(r5)
            if (r2 == 0) goto L44
            r3 = 44
            if (r2 == r3) goto L22
            r3 = 93
            if (r2 == r3) goto L40
            r5.reset()
            java.lang.Object r2 = r6.zaa(r4, r5)
            r0.add(r2)
            goto L22
        L40:
            r4.zaw(r1)
            return r0
        L44:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r6 = "Unexpected EOF"
            r5.<init>(r6)
            throw r5
        L4c:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r6 = "Expected start of array"
            r5.<init>(r6)
            throw r5
    }

    private final java.util.ArrayList zav(java.io.BufferedReader r10, com.google.android.gms.common.server.response.FastJsonResponse.Field r11) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r9 = this;
            java.lang.String r0 = "Error instantiating inner object"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            char r2 = r9.zai(r10)
            r3 = 93
            r4 = 5
            if (r2 == r3) goto L9a
            r5 = 110(0x6e, float:1.54E-43)
            if (r2 == r5) goto L90
            java.lang.String r5 = "Unexpected token: "
            r6 = 123(0x7b, float:1.72E-43)
            if (r2 != r6) goto L7b
            java.util.Stack r2 = r9.zat
            r7 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r2.push(r8)
        L24:
            com.google.android.gms.common.server.response.FastJsonResponse r2 = r11.zad()     // Catch: java.lang.IllegalAccessException -> L6d java.lang.InstantiationException -> L74
            boolean r8 = r9.zaz(r10, r2)     // Catch: java.lang.IllegalAccessException -> L6d java.lang.InstantiationException -> L74
            if (r8 == 0) goto L6c
            r1.add(r2)     // Catch: java.lang.IllegalAccessException -> L6d java.lang.InstantiationException -> L74
            char r2 = r9.zai(r10)
            r8 = 44
            if (r2 == r8) goto L54
            if (r2 != r3) goto L3f
            r9.zaw(r4)
            return r1
        L3f:
            com.google.android.gms.common.server.response.FastParser$ParseException r10 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L54:
            char r2 = r9.zai(r10)
            if (r2 != r6) goto L64
            java.util.Stack r2 = r9.zat
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r2.push(r8)
            goto L24
        L64:
            com.google.android.gms.common.server.response.FastParser$ParseException r10 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r11 = "Expected start of next object in array"
            r10.<init>(r11)
            throw r10
        L6c:
            return r1
        L6d:
            r10 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r11.<init>(r0, r10)
            throw r11
        L74:
            r10 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r11.<init>(r0, r10)
            throw r11
        L7b:
            com.google.android.gms.common.server.response.FastParser$ParseException r10 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L90:
            char[] r11 = com.google.android.gms.common.server.response.FastParser.zaa
            r9.zax(r10, r11)
            r9.zaw(r4)
            r10 = 0
            return r10
        L9a:
            r9.zaw(r4)
            return r1
    }

    private final void zaw(int r5) throws com.google.android.gms.common.server.response.FastParser.ParseException {
            r4 = this;
            java.util.Stack r0 = r4.zat
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "Expected state "
            if (r0 != 0) goto L36
            java.util.Stack r0 = r4.zat
            java.lang.Object r0 = r0.pop()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r5) goto L19
            return
        L19:
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r5)
            java.lang.String r5 = " but had "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r5 = r3.toString()
            r2.<init>(r5)
            throw r2
        L36:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = " but had empty stack"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            throw r0
    }

    private final void zax(java.io.BufferedReader r7, char[] r8) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.length
            if (r1 >= r2) goto L31
            char[] r3 = r6.zap
            int r2 = r2 - r1
            int r2 = r7.read(r3, r0, r2)
            r3 = -1
            if (r2 == r3) goto L29
            r3 = 0
        L10:
            if (r3 >= r2) goto L27
            int r4 = r3 + r1
            char r4 = r8[r4]
            char[] r5 = r6.zap
            char r5 = r5[r3]
            if (r4 != r5) goto L1f
            int r3 = r3 + 1
            goto L10
        L1f:
            com.google.android.gms.common.server.response.FastParser$ParseException r7 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r8 = "Unexpected character"
            r7.<init>(r8)
            throw r7
        L27:
            int r1 = r1 + r2
            goto L2
        L29:
            com.google.android.gms.common.server.response.FastParser$ParseException r7 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r8 = "Unexpected EOF"
            r7.<init>(r8)
            throw r7
        L31:
            return
    }

    private final boolean zay(java.io.BufferedReader r5, boolean r6) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            char r0 = r4.zai(r5)
            r1 = 34
            r2 = 1
            if (r0 == r1) goto L49
            r1 = 102(0x66, float:1.43E-43)
            r3 = 0
            if (r0 == r1) goto L3e
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L38
            r1 = 116(0x74, float:1.63E-43)
            if (r0 != r1) goto L21
            if (r6 == 0) goto L1b
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zac
            goto L1d
        L1b:
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zab
        L1d:
            r4.zax(r5, r6)
            return r2
        L21:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Unexpected token: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L38:
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zaa
            r4.zax(r5, r6)
            return r3
        L3e:
            if (r6 == 0) goto L43
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zae
            goto L45
        L43:
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zad
        L45:
            r4.zax(r5, r6)
            return r3
        L49:
            if (r6 != 0) goto L50
            boolean r5 = r4.zay(r5, r2)
            return r5
        L50:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r6 = "No boolean value found in string"
            r5.<init>(r6)
            throw r5
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final boolean zaz(java.io.BufferedReader r17, com.google.android.gms.common.server.response.FastJsonResponse r18) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            java.lang.String r3 = "Error instantiating inner object"
            java.util.Map r4 = r18.getFieldMappings()
            java.lang.String r5 = r16.zaq(r17)
            r7 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            if (r5 == 0) goto L27b
            r9 = 0
        L18:
            if (r5 == 0) goto L277
            java.lang.Object r5 = r4.get(r5)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r5 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r5
            if (r5 != 0) goto L27
            java.lang.String r5 = r16.zar(r17)
            goto L18
        L27:
            java.util.Stack r10 = r1.zat
            r11 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r10.push(r12)
            int r10 = r5.zaa
            r12 = 123(0x7b, float:1.72E-43)
            r13 = 44
            r14 = 125(0x7d, float:1.75E-43)
            r15 = 110(0x6e, float:1.54E-43)
            switch(r10) {
                case 0: goto L230;
                case 1: goto L218;
                case 2: goto L201;
                case 3: goto L1eb;
                case 4: goto L1d5;
                case 5: goto L1bf;
                case 6: goto L1a8;
                case 7: goto L192;
                case 8: goto L17e;
                case 9: goto L16c;
                case 10: goto Lc9;
                case 11: goto L55;
                default: goto L3e;
            }
        L3e:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid field type "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L55:
            boolean r10 = r5.zab
            if (r10 == 0) goto L8c
            char r10 = r16.zai(r17)
            if (r10 != r15) goto L6b
            char[] r10 = com.google.android.gms.common.server.response.FastParser.zaa
            r1.zax(r0, r10)
            java.lang.String r10 = r5.zae
            r2.addConcreteTypeArrayInternal(r5, r10, r9)
            goto L18f
        L6b:
            java.util.Stack r12 = r1.zat
            r15 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r12.push(r15)
            r12 = 91
            if (r10 != r12) goto L84
            java.lang.String r10 = r5.zae
            java.util.ArrayList r12 = r1.zav(r0, r5)
            r2.addConcreteTypeArrayInternal(r5, r10, r12)
            goto L18f
        L84:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected array start"
            r0.<init>(r2)
            throw r0
        L8c:
            char r10 = r16.zai(r17)
            if (r10 != r15) goto L9e
            char[] r10 = com.google.android.gms.common.server.response.FastParser.zaa
            r1.zax(r0, r10)
            java.lang.String r10 = r5.zae
            r2.addConcreteTypeInternal(r5, r10, r9)
            goto L18f
        L9e:
            java.util.Stack r15 = r1.zat
            r15.push(r8)
            if (r10 != r12) goto Lc1
            com.google.android.gms.common.server.response.FastJsonResponse r10 = r5.zad()     // Catch: java.lang.IllegalAccessException -> Lb3 java.lang.InstantiationException -> Lba
            r1.zaz(r0, r10)     // Catch: java.lang.IllegalAccessException -> Lb3 java.lang.InstantiationException -> Lba
            java.lang.String r12 = r5.zae     // Catch: java.lang.IllegalAccessException -> Lb3 java.lang.InstantiationException -> Lba
            r2.addConcreteTypeInternal(r5, r12, r10)     // Catch: java.lang.IllegalAccessException -> Lb3 java.lang.InstantiationException -> Lba
            goto L18f
        Lb3:
            r0 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>(r3, r0)
            throw r2
        Lba:
            r0 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>(r3, r0)
            throw r2
        Lc1:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected start of object"
            r0.<init>(r2)
            throw r0
        Lc9:
            char r10 = r16.zai(r17)
            if (r10 != r15) goto Ld6
            char[] r10 = com.google.android.gms.common.server.response.FastParser.zaa
            r1.zax(r0, r10)
            r10 = r9
            goto L11f
        Ld6:
            if (r10 != r12) goto L164
            java.util.Stack r10 = r1.zat
            r10.push(r8)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        Le2:
            char r12 = r16.zai(r17)
            if (r12 == 0) goto L15c
            r15 = 34
            if (r12 == r15) goto Lf3
            if (r12 == r14) goto Lef
            goto Le2
        Lef:
            r1.zaw(r7)
            goto L11f
        Lf3:
            char[] r12 = r1.zap
            java.lang.StringBuilder r11 = r1.zar
            java.lang.String r11 = zaA(r0, r12, r11, r9)
            char r12 = r16.zai(r17)
            r6 = 58
            if (r12 != r6) goto L14c
            char r6 = r16.zai(r17)
            if (r6 != r15) goto L13c
            char[] r6 = r1.zap
            java.lang.StringBuilder r12 = r1.zar
            java.lang.String r6 = zaA(r0, r6, r12, r9)
            r10.put(r11, r6)
            char r6 = r16.zai(r17)
            if (r6 == r13) goto L13a
            if (r6 != r14) goto L123
            r1.zaw(r7)
        L11f:
            r2.zaB(r5, r10)
            goto L18f
        L123:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected character while parsing string map: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L13a:
            r11 = 4
            goto Le2
        L13c:
            java.lang.String r0 = java.lang.String.valueOf(r11)
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r3 = "Expected String value for key "
            java.lang.String r0 = r3.concat(r0)
            r2.<init>(r0)
            throw r2
        L14c:
            java.lang.String r0 = java.lang.String.valueOf(r11)
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r3 = "No map value found for key "
            java.lang.String r0 = r3.concat(r0)
            r2.<init>(r0)
            throw r2
        L15c:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Unexpected EOF"
            r0.<init>(r2)
            throw r0
        L164:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected start of a map object"
            r0.<init>(r2)
            throw r0
        L16c:
            char[] r6 = r1.zaq
            java.lang.StringBuilder r10 = r1.zas
            char[] r11 = com.google.android.gms.common.server.response.FastParser.zaf
            java.lang.String r6 = r1.zap(r0, r6, r10, r11)
            byte[] r6 = com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(r6)
            r2.zal(r5, r6)
            goto L18f
        L17e:
            char[] r6 = r1.zaq
            java.lang.StringBuilder r10 = r1.zas
            char[] r11 = com.google.android.gms.common.server.response.FastParser.zaf
            java.lang.String r6 = r1.zap(r0, r6, r10, r11)
            byte[] r6 = com.google.android.gms.common.util.Base64Utils.decode(r6)
            r2.zal(r5, r6)
        L18f:
            r5 = 4
            goto L248
        L192:
            boolean r6 = r5.zab
            if (r6 == 0) goto L1a0
            com.google.android.gms.common.server.response.zai r6 = com.google.android.gms.common.server.response.FastParser.zal
            java.util.ArrayList r6 = r1.zau(r0, r6)
            r2.zaC(r5, r6)
            goto L18f
        L1a0:
            java.lang.String r6 = r16.zao(r17)
            r2.zaA(r5, r6)
            goto L18f
        L1a8:
            boolean r6 = r5.zab
            if (r6 == 0) goto L1b6
            com.google.android.gms.common.server.response.zai r6 = com.google.android.gms.common.server.response.FastParser.zak
            java.util.ArrayList r6 = r1.zau(r0, r6)
            r2.zaj(r5, r6)
            goto L18f
        L1b6:
            r6 = 0
            boolean r10 = r1.zay(r0, r6)
            r2.zai(r5, r10)
            goto L18f
        L1bf:
            boolean r6 = r5.zab
            if (r6 == 0) goto L1cd
            com.google.android.gms.common.server.response.zai r6 = com.google.android.gms.common.server.response.FastParser.zan
            java.util.ArrayList r6 = r1.zau(r0, r6)
            r2.zac(r5, r6)
            goto L18f
        L1cd:
            java.math.BigDecimal r6 = r16.zas(r17)
            r2.zaa(r5, r6)
            goto L18f
        L1d5:
            boolean r6 = r5.zab
            if (r6 == 0) goto L1e3
            com.google.android.gms.common.server.response.zai r6 = com.google.android.gms.common.server.response.FastParser.zaj
            java.util.ArrayList r6 = r1.zau(r0, r6)
            r2.zao(r5, r6)
            goto L18f
        L1e3:
            double r10 = r16.zaj(r17)
            r2.zam(r5, r10)
            goto L18f
        L1eb:
            boolean r6 = r5.zab
            if (r6 == 0) goto L1f9
            com.google.android.gms.common.server.response.zai r6 = com.google.android.gms.common.server.response.FastParser.zai
            java.util.ArrayList r6 = r1.zau(r0, r6)
            r2.zas(r5, r6)
            goto L18f
        L1f9:
            float r6 = r16.zak(r17)
            r2.zaq(r5, r6)
            goto L18f
        L201:
            boolean r6 = r5.zab
            if (r6 == 0) goto L20f
            com.google.android.gms.common.server.response.zai r6 = com.google.android.gms.common.server.response.FastParser.zah
            java.util.ArrayList r6 = r1.zau(r0, r6)
            r2.zay(r5, r6)
            goto L18f
        L20f:
            long r10 = r16.zan(r17)
            r2.zax(r5, r10)
            goto L18f
        L218:
            boolean r6 = r5.zab
            if (r6 == 0) goto L227
            com.google.android.gms.common.server.response.zai r6 = com.google.android.gms.common.server.response.FastParser.zam
            java.util.ArrayList r6 = r1.zau(r0, r6)
            r2.zag(r5, r6)
            goto L18f
        L227:
            java.math.BigInteger r6 = r16.zat(r17)
            r2.zae(r5, r6)
            goto L18f
        L230:
            boolean r6 = r5.zab
            if (r6 == 0) goto L23f
            com.google.android.gms.common.server.response.zai r6 = com.google.android.gms.common.server.response.FastParser.zag
            java.util.ArrayList r6 = r1.zau(r0, r6)
            r2.zav(r5, r6)
            goto L18f
        L23f:
            int r6 = r16.zal(r17)
            r2.zau(r5, r6)
            goto L18f
        L248:
            r1.zaw(r5)
            r5 = 2
            r1.zaw(r5)
            char r5 = r16.zai(r17)
            if (r5 == r13) goto L271
            if (r5 != r14) goto L25a
            r5 = r9
            goto L18
        L25a:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected end of object or field separator, but found: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L271:
            java.lang.String r5 = r16.zaq(r17)
            goto L18
        L277:
            r1.zaw(r7)
            return r7
        L27b:
            r1.zaw(r7)
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void parse(java.io.InputStream r7, T r8) throws com.google.android.gms.common.server.response.FastParser.ParseException {
            r6 = this;
            java.lang.String r0 = "Failed to close reader while parsing."
            java.lang.String r1 = "FastParser"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r7)
            r7 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r7)
            java.util.Stack r7 = r6.zat     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            r7.push(r4)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            char r7 = r6.zai(r2)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            if (r7 == 0) goto L91
            r4 = 91
            r5 = 1
            if (r7 == r4) goto L4d
            r4 = 123(0x7b, float:1.72E-43)
            if (r7 != r4) goto L36
            java.util.Stack r7 = r6.zat     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            r7.push(r4)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            r6.zaz(r2, r8)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            goto L7e
        L36:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            r3.<init>()     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            java.lang.String r4 = "Unexpected token: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            r3.append(r7)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            throw r8     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
        L4d:
            java.util.Stack r7 = r6.zat     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            r4 = 5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            r7.push(r4)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            java.util.Map r7 = r8.getFieldMappings()     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            int r4 = r7.size()     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            if (r4 != r5) goto L89
            java.util.Set r7 = r7.entrySet()     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            java.lang.Object r7 = r7.next()     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            com.google.android.gms.common.server.response.FastJsonResponse$Field r7 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r7     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            java.util.ArrayList r4 = r6.zav(r2, r7)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            java.lang.String r5 = r7.zae     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            r8.addConcreteTypeArrayInternal(r7, r5, r4)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
        L7e:
            r6.zaw(r3)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            r2.close()     // Catch: java.io.IOException -> L85
            return
        L85:
            android.util.Log.w(r1, r0)
            return
        L89:
            com.google.android.gms.common.server.response.FastParser$ParseException r7 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            java.lang.String r8 = "Object array response class must have a single Field"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            throw r7     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
        L91:
            com.google.android.gms.common.server.response.FastParser$ParseException r7 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            java.lang.String r8 = "No data to parse"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
            throw r7     // Catch: java.lang.Throwable -> L99 java.io.IOException -> L9b
        L99:
            r7 = move-exception
            goto La2
        L9b:
            r7 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L99
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L99
            throw r8     // Catch: java.lang.Throwable -> L99
        La2:
            r2.close()     // Catch: java.io.IOException -> La6
            goto La9
        La6:
            android.util.Log.w(r1, r0)
        La9:
            throw r7
    }
}
