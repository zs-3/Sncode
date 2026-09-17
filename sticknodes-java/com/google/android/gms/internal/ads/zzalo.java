package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzalo {
    public final java.lang.String zza;
    public final int zzb;
    public final java.lang.Integer zzc;
    public final java.lang.Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzalo(java.lang.String r1, int r2, java.lang.Integer r3, java.lang.Integer r4, float r5, boolean r6, boolean r7, boolean r8, boolean r9, int r10) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            r0.zzj = r10
            return
    }

    static /* bridge */ /* synthetic */ int zza(java.lang.String r0) {
            int r0 = zzd(r0)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzalo zzb(java.lang.String r20, com.google.android.gms.internal.ads.zzalm r21) {
            r1 = r20
            r2 = r21
            java.lang.String r3 = "'"
            java.lang.String r0 = "Style:"
            boolean r0 = r1.startsWith(r0)
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r0 = 6
            java.lang.String r0 = r1.substring(r0)
            java.lang.String r4 = ","
            java.lang.String[] r4 = android.text.TextUtils.split(r0, r4)
            int r0 = r4.length
            int r5 = r2.zzk
            r6 = 3
            r7 = 0
            java.lang.String r8 = "SsaStyle"
            r9 = 1
            r10 = 0
            if (r0 == r5) goto L42
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2[r10] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r9] = r0
            r0 = 2
            r2[r0] = r1
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'"
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            com.google.android.gms.internal.ads.zzea.zzf(r8, r0)
            return r7
        L42:
            com.google.android.gms.internal.ads.zzalo r5 = new com.google.android.gms.internal.ads.zzalo     // Catch: java.lang.RuntimeException -> L134
            int r0 = r2.zza     // Catch: java.lang.RuntimeException -> L134
            r0 = r4[r0]     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r11 = r0.trim()     // Catch: java.lang.RuntimeException -> L134
            int r0 = r2.zzb     // Catch: java.lang.RuntimeException -> L134
            r12 = -1
            if (r0 == r12) goto L5d
            r0 = r4[r0]     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r0 = r0.trim()     // Catch: java.lang.RuntimeException -> L134
            int r0 = zzd(r0)     // Catch: java.lang.RuntimeException -> L134
            r13 = r0
            goto L5e
        L5d:
            r13 = -1
        L5e:
            int r0 = r2.zzc     // Catch: java.lang.RuntimeException -> L134
            if (r0 == r12) goto L6e
            r0 = r4[r0]     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r0 = r0.trim()     // Catch: java.lang.RuntimeException -> L134
            java.lang.Integer r0 = zzc(r0)     // Catch: java.lang.RuntimeException -> L134
            r14 = r0
            goto L6f
        L6e:
            r14 = r7
        L6f:
            int r0 = r2.zzd     // Catch: java.lang.RuntimeException -> L134
            if (r0 == r12) goto L7f
            r0 = r4[r0]     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r0 = r0.trim()     // Catch: java.lang.RuntimeException -> L134
            java.lang.Integer r0 = zzc(r0)     // Catch: java.lang.RuntimeException -> L134
            r15 = r0
            goto L80
        L7f:
            r15 = r7
        L80:
            int r0 = r2.zze     // Catch: java.lang.RuntimeException -> L134
            r16 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r0 == r12) goto Lad
            r0 = r4[r0]     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r10 = r0.trim()     // Catch: java.lang.RuntimeException -> L134
            float r0 = java.lang.Float.parseFloat(r10)     // Catch: java.lang.NumberFormatException -> L94 java.lang.RuntimeException -> L134
            r16 = r0
            goto Lad
        L94:
            r0 = move-exception
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L134
            r0.<init>()     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r6 = "Failed to parse font size: '"
            r0.append(r6)     // Catch: java.lang.RuntimeException -> L134
            r0.append(r10)     // Catch: java.lang.RuntimeException -> L134
            r0.append(r3)     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r0 = r0.toString()     // Catch: java.lang.RuntimeException -> L134
            com.google.android.gms.internal.ads.zzea.zzg(r8, r0, r7)     // Catch: java.lang.RuntimeException -> L134
        Lad:
            int r0 = r2.zzf     // Catch: java.lang.RuntimeException -> L134
            if (r0 == r12) goto Lbf
            r0 = r4[r0]     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r0 = r0.trim()     // Catch: java.lang.RuntimeException -> L134
            boolean r0 = zze(r0)     // Catch: java.lang.RuntimeException -> L134
            if (r0 == 0) goto Lbf
            r0 = 1
            goto Lc0
        Lbf:
            r0 = 0
        Lc0:
            int r6 = r2.zzg     // Catch: java.lang.RuntimeException -> L134
            if (r6 == r12) goto Ld2
            r6 = r4[r6]     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r6 = r6.trim()     // Catch: java.lang.RuntimeException -> L134
            boolean r6 = zze(r6)     // Catch: java.lang.RuntimeException -> L134
            if (r6 == 0) goto Ld2
            r6 = 1
            goto Ld3
        Ld2:
            r6 = 0
        Ld3:
            int r7 = r2.zzh     // Catch: java.lang.RuntimeException -> L134
            if (r7 == r12) goto Le5
            r7 = r4[r7]     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r7 = r7.trim()     // Catch: java.lang.RuntimeException -> L134
            boolean r7 = zze(r7)     // Catch: java.lang.RuntimeException -> L134
            if (r7 == 0) goto Le5
            r7 = 1
            goto Le6
        Le5:
            r7 = 0
        Le6:
            int r10 = r2.zzi     // Catch: java.lang.RuntimeException -> L134
            if (r10 == r12) goto Lf9
            r10 = r4[r10]     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r10 = r10.trim()     // Catch: java.lang.RuntimeException -> L134
            boolean r10 = zze(r10)     // Catch: java.lang.RuntimeException -> L134
            if (r10 == 0) goto Lf9
            r19 = 1
            goto Lfb
        Lf9:
            r19 = 0
        Lfb:
            int r2 = r2.zzj     // Catch: java.lang.RuntimeException -> L134
            if (r2 == r12) goto L11f
            r2 = r4[r2]     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r2 = r2.trim()     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r4 = r2.trim()     // Catch: java.lang.NumberFormatException -> L112 java.lang.RuntimeException -> L134
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L112 java.lang.RuntimeException -> L134
            if (r4 == r9) goto L120
            r9 = 3
            if (r4 == r9) goto L120
        L112:
            java.lang.String r4 = "Ignoring unknown BorderStyle: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.RuntimeException -> L134
            java.lang.String r2 = r4.concat(r2)     // Catch: java.lang.RuntimeException -> L134
            com.google.android.gms.internal.ads.zzea.zzf(r8, r2)     // Catch: java.lang.RuntimeException -> L134
        L11f:
            r4 = -1
        L120:
            r9 = r5
            r10 = r11
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r16
            r15 = r0
            r16 = r6
            r17 = r7
            r18 = r19
            r19 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.RuntimeException -> L134
            return r5
        L134:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Skipping malformed 'Style:' line: '"
            r2.append(r4)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzea.zzg(r8, r1, r0)
            r1 = 0
            return r1
    }

    public static java.lang.Integer zzc(java.lang.String r10) {
            java.lang.String r0 = "&H"
            boolean r0 = r10.startsWith(r0)     // Catch: java.lang.IllegalArgumentException -> L52
            r1 = 16
            if (r0 == 0) goto L14
            r0 = 2
            java.lang.String r0 = r10.substring(r0)     // Catch: java.lang.IllegalArgumentException -> L52
            long r2 = java.lang.Long.parseLong(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L52
            goto L18
        L14:
            long r2 = java.lang.Long.parseLong(r10)     // Catch: java.lang.IllegalArgumentException -> L52
        L18:
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)     // Catch: java.lang.IllegalArgumentException -> L52
            r10 = 24
            long r4 = r2 >> r10
            long r0 = r2 >> r1
            r10 = 8
            long r6 = r2 >> r10
            r8 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r8
            long r4 = r4 & r8
            long r4 = r4 ^ r8
            int r10 = com.google.android.gms.internal.ads.zzgdu.zzb(r4)
            long r0 = r0 & r8
            int r0 = com.google.android.gms.internal.ads.zzgdu.zzb(r0)
            long r4 = r6 & r8
            int r1 = com.google.android.gms.internal.ads.zzgdu.zzb(r4)
            int r2 = com.google.android.gms.internal.ads.zzgdu.zzb(r2)
            int r10 = android.graphics.Color.argb(r10, r2, r1, r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
        L52:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse color expression: '"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = "'"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            java.lang.String r1 = "SsaStyle"
            com.google.android.gms.internal.ads.zzea.zzg(r1, r10, r0)
            r10 = 0
            return r10
    }

    private static int zzd(java.lang.String r1) {
            java.lang.String r0 = r1.trim()     // Catch: java.lang.NumberFormatException -> Ld
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Ld
            switch(r0) {
                case 1: goto Lc;
                case 2: goto Lc;
                case 3: goto Lc;
                case 4: goto Lc;
                case 5: goto Lc;
                case 6: goto Lc;
                case 7: goto Lc;
                case 8: goto Lc;
                case 9: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto Ld
        Lc:
            return r0
        Ld:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Ignoring unknown alignment: "
            java.lang.String r1 = r0.concat(r1)
            java.lang.String r0 = "SsaStyle"
            com.google.android.gms.internal.ads.zzea.zzf(r0, r1)
            r1 = -1
            return r1
    }

    private static boolean zze(java.lang.String r4) {
            r0 = 0
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> Le
            r1 = 1
            if (r4 == r1) goto Ld
            r2 = -1
            if (r4 != r2) goto Lc
            goto Ld
        Lc:
            return r0
        Ld:
            return r1
        Le:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to parse boolean value: '"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = "'"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r2 = "SsaStyle"
            com.google.android.gms.internal.ads.zzea.zzg(r2, r4, r1)
            return r0
    }
}
