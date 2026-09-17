package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzajp {
    private static final com.google.android.gms.internal.ads.zzfym zza = null;
    private static final com.google.android.gms.internal.ads.zzfym zzb = null;
    private final java.util.List zzc;
    private int zzd;
    private int zze;

    static {
            r0 = 58
            com.google.android.gms.internal.ads.zzfxn r0 = com.google.android.gms.internal.ads.zzfxn.zzc(r0)
            com.google.android.gms.internal.ads.zzfym r0 = com.google.android.gms.internal.ads.zzfym.zzb(r0)
            com.google.android.gms.internal.ads.zzajp.zza = r0
            r0 = 42
            com.google.android.gms.internal.ads.zzfxn r0 = com.google.android.gms.internal.ads.zzfxn.zzc(r0)
            com.google.android.gms.internal.ads.zzfym r0 = com.google.android.gms.internal.ads.zzfym.zzb(r0)
            com.google.android.gms.internal.ads.zzajp.zzb = r0
            return
    }

    public zzajp() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzc = r0
            r0 = 0
            r1.zzd = r0
            return
    }

    public final int zza(com.google.android.gms.internal.ads.zzadc r30, com.google.android.gms.internal.ads.zzadx r31, java.util.List r32) throws java.io.IOException {
            r29 = this;
            r1 = r29
            r0 = r30
            r2 = r31
            int r3 = r1.zzd
            r6 = 1
            if (r3 == 0) goto L208
            r7 = 8
            r8 = 2
            r9 = 0
            if (r3 == r6) goto L1d5
            r11 = 2819(0xb03, float:3.95E-42)
            r12 = 2817(0xb01, float:3.947E-42)
            r13 = 2816(0xb00, float:3.946E-42)
            r14 = 2192(0x890, float:3.072E-42)
            r15 = 3
            if (r3 == r8) goto L15b
            long r16 = r30.zzf()
            long r18 = r30.zzd()
            long r20 = r30.zzf()
            long r18 = r18 - r20
            int r3 = r1.zze
            long r4 = (long) r3
            com.google.android.gms.internal.ads.zzek r3 = new com.google.android.gms.internal.ads.zzek
            long r4 = r18 - r4
            int r5 = (int) r4
            r3.<init>(r5)
            byte[] r4 = r3.zzN()
            r0.zzi(r4, r9, r5)
            r0 = 0
        L3d:
            java.util.List r4 = r1.zzc
            int r4 = r4.size()
            if (r0 >= r4) goto L155
            java.util.List r4 = r1.zzc
            java.lang.Object r4 = r4.get(r0)
            com.google.android.gms.internal.ads.zzajo r4 = (com.google.android.gms.internal.ads.zzajo) r4
            long r9 = r4.zza
            long r9 = r9 - r16
            int r7 = (int) r9
            r3.zzL(r7)
            r7 = 4
            r3.zzM(r7)
            int r9 = r3.zzi()
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r10 = r3.zzB(r9, r10)
            int r19 = r10.hashCode()
            r22 = -1
            switch(r19) {
                case -1711564334: goto L95;
                case -1332107749: goto L8b;
                case -1251387154: goto L81;
                case -830665521: goto L77;
                case 1760745220: goto L6d;
                default: goto L6c;
            }
        L6c:
            goto L9f
        L6d:
            java.lang.String r5 = "Super_SlowMotion_BGM"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L9f
            r5 = 2
            goto La0
        L77:
            java.lang.String r5 = "Super_SlowMotion_Deflickering_On"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L9f
            r5 = 4
            goto La0
        L81:
            java.lang.String r5 = "Super_SlowMotion_Data"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L9f
            r5 = 1
            goto La0
        L8b:
            java.lang.String r5 = "Super_SlowMotion_Edit_Data"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L9f
            r5 = 3
            goto La0
        L95:
            java.lang.String r5 = "SlowMotion_Data"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L9f
            r5 = 0
            goto La0
        L9f:
            r5 = -1
        La0:
            r10 = 0
            if (r5 == 0) goto Lbe
            if (r5 == r6) goto Lbb
            if (r5 == r8) goto Lb8
            if (r5 == r15) goto Lb5
            if (r5 != r7) goto Lae
            r5 = 2820(0xb04, float:3.952E-42)
            goto Lc0
        Lae:
            java.lang.String r0 = "Invalid SEF name"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r10)
            throw r0
        Lb5:
            r5 = 2819(0xb03, float:3.95E-42)
            goto Lc0
        Lb8:
            r5 = 2817(0xb01, float:3.947E-42)
            goto Lc0
        Lbb:
            r5 = 2816(0xb00, float:3.946E-42)
            goto Lc0
        Lbe:
            r5 = 2192(0x890, float:3.072E-42)
        Lc0:
            int r4 = r4.zzb
            int r9 = r9 + 8
            int r4 = r4 - r9
            if (r5 == r14) goto Ldb
            if (r5 == r13) goto Ld8
            if (r5 == r12) goto Ld8
            if (r5 == r11) goto Ld8
            r4 = 2820(0xb04, float:3.952E-42)
            if (r5 != r4) goto Ld2
            goto Ld8
        Ld2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        Ld8:
            r7 = r32
            goto L14e
        Ldb:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r4 = r3.zzB(r4, r5)
            com.google.android.gms.internal.ads.zzfym r5 = com.google.android.gms.internal.ads.zzajp.zzb
            java.util.List r4 = r5.zze(r4)
            r9 = 0
        Led:
            int r5 = r4.size()
            if (r9 >= r5) goto L144
            com.google.android.gms.internal.ads.zzfym r5 = com.google.android.gms.internal.ads.zzajp.zza
            java.lang.Object r19 = r4.get(r9)
            r11 = r19
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.util.List r11 = r5.zze(r11)
            int r5 = r11.size()
            if (r5 != r15) goto L13f
            r5 = 0
            java.lang.Object r19 = r11.get(r5)     // Catch: java.lang.NumberFormatException -> L139
            java.lang.String r19 = (java.lang.String) r19     // Catch: java.lang.NumberFormatException -> L139
            long r24 = java.lang.Long.parseLong(r19)     // Catch: java.lang.NumberFormatException -> L139
            java.lang.Object r19 = r11.get(r6)     // Catch: java.lang.NumberFormatException -> L139
            java.lang.String r19 = (java.lang.String) r19     // Catch: java.lang.NumberFormatException -> L139
            long r26 = java.lang.Long.parseLong(r19)     // Catch: java.lang.NumberFormatException -> L139
            java.lang.Object r11 = r11.get(r8)     // Catch: java.lang.NumberFormatException -> L139
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.NumberFormatException -> L139
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.NumberFormatException -> L139
            int r11 = r11 + (-1)
            int r28 = r6 << r11
            com.google.android.gms.internal.ads.zzahm r11 = new com.google.android.gms.internal.ads.zzahm     // Catch: java.lang.NumberFormatException -> L139
            r23 = r11
            r23.<init>(r24, r26, r28)     // Catch: java.lang.NumberFormatException -> L139
            r7.add(r11)     // Catch: java.lang.NumberFormatException -> L139
            int r9 = r9 + 1
            r11 = 2819(0xb03, float:3.95E-42)
            goto Led
        L139:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r10, r0)
            throw r0
        L13f:
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r10, r10)
            throw r0
        L144:
            com.google.android.gms.internal.ads.zzahn r4 = new com.google.android.gms.internal.ads.zzahn
            r4.<init>(r7)
            r7 = r32
            r7.add(r4)
        L14e:
            int r0 = r0 + 1
            r9 = 0
            r11 = 2819(0xb03, float:3.95E-42)
            goto L3d
        L155:
            r9 = 0
            r2.zza = r9
            goto L206
        L15b:
            long r3 = r30.zzd()
            int r9 = r1.zze
            int r9 = r9 + (-20)
            com.google.android.gms.internal.ads.zzek r10 = new com.google.android.gms.internal.ads.zzek
            r10.<init>(r9)
            byte[] r11 = r10.zzN()
            r5 = 0
            r0.zzi(r11, r5, r9)
            r0 = 0
        L171:
            int r11 = r9 / 12
            if (r0 >= r11) goto L1b8
            r10.zzM(r8)
            short r11 = r10.zzD()
            if (r11 == r14) goto L190
            if (r11 == r13) goto L190
            if (r11 == r12) goto L190
            r5 = 2819(0xb03, float:3.95E-42)
            if (r11 == r5) goto L190
            r5 = 2820(0xb04, float:3.952E-42)
            if (r11 == r5) goto L190
            r10.zzM(r7)
            r32 = r9
            goto L1ab
        L190:
            int r5 = r1.zze
            long r12 = (long) r5
            long r12 = r3 - r12
            int r5 = r10.zzi()
            r32 = r9
            long r8 = (long) r5
            int r5 = r10.zzi()
            java.util.List r14 = r1.zzc
            com.google.android.gms.internal.ads.zzajo r6 = new com.google.android.gms.internal.ads.zzajo
            long r12 = r12 - r8
            r6.<init>(r11, r12, r5)
            r14.add(r6)
        L1ab:
            int r0 = r0 + 1
            r9 = r32
            r6 = 1
            r8 = 2
            r12 = 2817(0xb01, float:3.947E-42)
            r13 = 2816(0xb00, float:3.946E-42)
            r14 = 2192(0x890, float:3.072E-42)
            goto L171
        L1b8:
            java.util.List r0 = r1.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1c5
            r3 = 0
            r2.zza = r3
            goto L206
        L1c5:
            r1.zzd = r15
            java.util.List r0 = r1.zzc
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.zzajo r0 = (com.google.android.gms.internal.ads.zzajo) r0
            long r3 = r0.zza
            r2.zza = r3
            goto L206
        L1d5:
            r3 = 0
            com.google.android.gms.internal.ads.zzek r4 = new com.google.android.gms.internal.ads.zzek
            r4.<init>(r7)
            byte[] r5 = r4.zzN()
            r0.zzi(r5, r3, r7)
            int r3 = r4.zzi()
            int r3 = r3 + r7
            r1.zze = r3
            int r3 = r4.zzg()
            r4 = 1397048916(0x53454654, float:8.4728847E11)
            if (r3 == r4) goto L1f7
            r3 = 0
            r2.zza = r3
            goto L206
        L1f7:
            long r3 = r30.zzf()
            int r0 = r1.zze
            int r0 = r0 + (-12)
            long r5 = (long) r0
            long r3 = r3 - r5
            r2.zza = r3
            r0 = 2
            r1.zzd = r0
        L206:
            r0 = 1
            goto L226
        L208:
            r3 = 0
            long r5 = r30.zzd()
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L220
            r7 = 8
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L21b
            goto L220
        L21b:
            r3 = -8
            long r4 = r5 + r3
            goto L221
        L220:
            r4 = r3
        L221:
            r2.zza = r4
            r0 = 1
            r1.zzd = r0
        L226:
            return r0
    }

    public final void zzb() {
            r1 = this;
            java.util.List r0 = r1.zzc
            r0.clear()
            r0 = 0
            r1.zzd = r0
            return
    }
}
