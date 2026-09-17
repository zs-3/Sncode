package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
abstract class zzab {
    final java.lang.String zzb;
    final int zzc;
    java.lang.Boolean zzd;
    java.lang.Boolean zze;
    java.lang.Long zzf;
    java.lang.Long zzg;

    zzab(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    private static java.lang.Boolean zzd(java.lang.String r2, int r3, boolean r4, java.lang.String r5, java.util.List r6, java.lang.String r7, com.google.android.gms.measurement.internal.zzhe r8) {
            r0 = 0
            r1 = 7
            if (r3 != r1) goto Le
            if (r6 == 0) goto Ld
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto Ld
            goto L11
        Ld:
            return r0
        Le:
            if (r5 != 0) goto L11
            return r0
        L11:
            if (r4 != 0) goto L1c
            r1 = 2
            if (r3 == r1) goto L1c
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toUpperCase(r1)
        L1c:
            int r3 = r3 + (-1)
            switch(r3) {
                case 1: goto L52;
                case 2: goto L49;
                case 3: goto L40;
                case 4: goto L37;
                case 5: goto L2e;
                case 6: goto L22;
                default: goto L21;
            }
        L21:
            return r0
        L22:
            if (r6 != 0) goto L25
            return r0
        L25:
            boolean r2 = r6.contains(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L2e:
            boolean r2 = r2.equals(r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L37:
            boolean r2 = r2.contains(r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L40:
            boolean r2 = r2.endsWith(r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L49:
            boolean r2 = r2.startsWith(r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L52:
            if (r7 != 0) goto L55
            return r0
        L55:
            r3 = 1
            if (r3 == r4) goto L5b
            r3 = 66
            goto L5c
        L5b:
            r3 = 0
        L5c:
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r7, r3)     // Catch: java.util.regex.PatternSyntaxException -> L6d
            java.util.regex.Matcher r2 = r3.matcher(r2)     // Catch: java.util.regex.PatternSyntaxException -> L6d
            boolean r2 = r2.matches()     // Catch: java.util.regex.PatternSyntaxException -> L6d
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.util.regex.PatternSyntaxException -> L6d
            return r2
        L6d:
            if (r8 == 0) goto L79
            com.google.android.gms.measurement.internal.zzhc r2 = r8.zzk()
            java.lang.String r3 = "Invalid regular expression in REGEXP audience filter. expression"
            r2.zzb(r3, r7)
        L79:
            return r0
    }

    static java.lang.Boolean zze(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.zzfp r9, double r10) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            boolean r0 = r9.zzg()
            r1 = 0
            if (r0 == 0) goto L115
            int r0 = r9.zzm()
            r2 = 1
            if (r0 != r2) goto L13
            goto L115
        L13:
            int r0 = r9.zzm()
            r3 = 5
            if (r0 != r3) goto L28
            boolean r0 = r9.zzk()
            if (r0 == 0) goto L27
            boolean r0 = r9.zzj()
            if (r0 == 0) goto L27
            goto L2f
        L27:
            return r1
        L28:
            boolean r0 = r9.zzh()
            if (r0 != 0) goto L2f
            return r1
        L2f:
            int r0 = r9.zzm()
            int r4 = r9.zzm()
            if (r4 != r3) goto L64
            java.lang.String r4 = r9.zze()
            boolean r4 = com.google.android.gms.measurement.internal.zzqa.zzA(r4)
            if (r4 == 0) goto L63
            java.lang.String r4 = r9.zzd()
            boolean r4 = com.google.android.gms.measurement.internal.zzqa.zzA(r4)
            if (r4 != 0) goto L4e
            goto L63
        L4e:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L63
            java.lang.String r5 = r9.zze()     // Catch: java.lang.NumberFormatException -> L63
            r4.<init>(r5)     // Catch: java.lang.NumberFormatException -> L63
            java.math.BigDecimal r5 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L63
            java.lang.String r9 = r9.zzd()     // Catch: java.lang.NumberFormatException -> L63
            r5.<init>(r9)     // Catch: java.lang.NumberFormatException -> L63
            r9 = r4
            r4 = r1
            goto L7a
        L63:
            return r1
        L64:
            java.lang.String r4 = r9.zzc()
            boolean r4 = com.google.android.gms.measurement.internal.zzqa.zzA(r4)
            if (r4 != 0) goto L6f
            return r1
        L6f:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L115
            java.lang.String r9 = r9.zzc()     // Catch: java.lang.NumberFormatException -> L115
            r4.<init>(r9)     // Catch: java.lang.NumberFormatException -> L115
            r9 = r1
            r5 = r9
        L7a:
            if (r0 != r3) goto L7f
            if (r9 == 0) goto L107
            goto L83
        L7f:
            if (r4 != 0) goto L83
            goto L107
        L83:
            int r0 = r0 + (-1)
            r3 = 0
            if (r0 == r2) goto L105
            r6 = 2
            if (r0 == r6) goto Lf5
            r7 = 3
            if (r0 == r7) goto La8
            r10 = 4
            if (r0 == r10) goto L93
            goto L107
        L93:
            if (r9 == 0) goto L107
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto La2
            int r8 = r8.compareTo(r5)
            if (r8 > 0) goto La2
            goto La3
        La2:
            r2 = 0
        La3:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L107
        La8:
            if (r4 != 0) goto Lab
            goto L107
        Lab:
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto Le8
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r4.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto Le2
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r4.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto Le2
            goto Le3
        Le2:
            r2 = 0
        Le3:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L107
        Le8:
            int r8 = r8.compareTo(r4)
            if (r8 != 0) goto Lef
            goto Lf0
        Lef:
            r2 = 0
        Lf0:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L107
        Lf5:
            if (r4 != 0) goto Lf8
            goto L107
        Lf8:
            int r8 = r8.compareTo(r4)
            if (r8 <= 0) goto Lff
            goto L100
        Lff:
            r2 = 0
        L100:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L105:
            if (r4 != 0) goto L108
        L107:
            return r1
        L108:
            int r8 = r8.compareTo(r4)
            if (r8 >= 0) goto L10f
            goto L110
        L10f:
            r2 = 0
        L110:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L115:
            return r1
    }

    static java.lang.Boolean zzf(java.lang.String r10, com.google.android.gms.internal.measurement.zzfv r11, com.google.android.gms.measurement.internal.zzhe r12) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)
            r0 = 0
            if (r10 != 0) goto L8
            goto L8d
        L8:
            boolean r1 = r11.zzi()
            if (r1 == 0) goto L8d
            int r1 = r11.zzj()
            r2 = 1
            if (r1 == r2) goto L8d
            int r1 = r11.zzj()
            r2 = 7
            if (r1 != r2) goto L23
            int r1 = r11.zza()
            if (r1 == 0) goto L8d
            goto L2b
        L23:
            boolean r1 = r11.zzh()
            if (r1 != 0) goto L2b
            goto L8d
        L2b:
            int r4 = r11.zzj()
            boolean r5 = r11.zzf()
            r1 = 2
            if (r5 != 0) goto L46
            if (r4 == r1) goto L46
            if (r4 != r2) goto L3b
            goto L46
        L3b:
            java.lang.String r2 = r11.zzd()
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toUpperCase(r3)
            goto L4a
        L46:
            java.lang.String r2 = r11.zzd()
        L4a:
            r6 = r2
            int r2 = r11.zza()
            if (r2 != 0) goto L53
            r7 = r0
            goto L81
        L53:
            java.util.List r11 = r11.zze()
            if (r5 != 0) goto L80
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r11.size()
            r2.<init>(r3)
            java.util.Iterator r11 = r11.iterator()
        L66:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r11.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r7 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toUpperCase(r7)
            r2.add(r3)
            goto L66
        L7c:
            java.util.List r11 = java.util.Collections.unmodifiableList(r2)
        L80:
            r7 = r11
        L81:
            if (r4 != r1) goto L85
            r8 = r6
            goto L86
        L85:
            r8 = r0
        L86:
            r3 = r10
            r9 = r12
            java.lang.Boolean r10 = zzd(r3, r4, r5, r6, r7, r8, r9)
            return r10
        L8d:
            return r0
    }

    static java.lang.Boolean zzg(double r1, com.google.android.gms.internal.measurement.zzfp r3) {
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> Le
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> Le
            double r1 = java.lang.Math.ulp(r1)     // Catch: java.lang.NumberFormatException -> Le
            java.lang.Boolean r1 = zze(r0, r3, r1)     // Catch: java.lang.NumberFormatException -> Le
            return r1
        Le:
            r1 = 0
            return r1
    }

    static java.lang.Boolean zzh(long r1, com.google.android.gms.internal.measurement.zzfp r3) {
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> Lc
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> Lc
            r1 = 0
            java.lang.Boolean r1 = zze(r0, r3, r1)     // Catch: java.lang.NumberFormatException -> Lc
            return r1
        Lc:
            r1 = 0
            return r1
    }

    static java.lang.Boolean zzi(java.lang.String r4, com.google.android.gms.internal.measurement.zzfp r5) {
            boolean r0 = com.google.android.gms.measurement.internal.zzqa.zzA(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L14
            r0.<init>(r4)     // Catch: java.lang.NumberFormatException -> L14
            r2 = 0
            java.lang.Boolean r4 = zze(r0, r5, r2)     // Catch: java.lang.NumberFormatException -> L14
            return r4
        L14:
            return r1
    }

    static java.lang.Boolean zzj(java.lang.Boolean r0, boolean r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = r0.booleanValue()
            if (r0 == r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    abstract int zza();

    abstract boolean zzb();

    abstract boolean zzc();
}
