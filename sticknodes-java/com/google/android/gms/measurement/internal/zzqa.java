package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzqa extends com.google.android.gms.measurement.internal.zzpg {
    zzqa(com.google.android.gms.measurement.internal.zzpv r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static boolean zzA(java.lang.String r1) {
            if (r1 == 0) goto L14
            java.lang.String r0 = "([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L14
            int r1 = r1.length()
            r0 = 310(0x136, float:4.34E-43)
            if (r1 > r0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    static android.os.Bundle[] zzC(java.util.List r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L9:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r7.next()
            com.google.android.gms.internal.measurement.zzhq r1 = (com.google.android.gms.internal.measurement.zzhq) r1
            if (r1 == 0) goto L9
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.List r1 = r1.zzi()
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r1.next()
            com.google.android.gms.internal.measurement.zzhq r3 = (com.google.android.gms.internal.measurement.zzhq) r3
            boolean r4 = r3.zzy()
            if (r4 == 0) goto L42
            java.lang.String r4 = r3.zzg()
            java.lang.String r3 = r3.zzh()
            r2.putString(r4, r3)
            goto L24
        L42:
            boolean r4 = r3.zzw()
            if (r4 == 0) goto L54
            java.lang.String r4 = r3.zzg()
            long r5 = r3.zzd()
            r2.putLong(r4, r5)
            goto L24
        L54:
            boolean r4 = r3.zzu()
            if (r4 == 0) goto L24
            java.lang.String r4 = r3.zzg()
            double r5 = r3.zza()
            r2.putDouble(r4, r5)
            goto L24
        L66:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L9
            r0.add(r2)
            goto L9
        L70:
            int r7 = r0.size()
            android.os.Bundle[] r7 = new android.os.Bundle[r7]
            java.lang.Object[] r7 = r0.toArray(r7)
            android.os.Bundle[] r7 = (android.os.Bundle[]) r7
            return r7
    }

    static final void zzD(com.google.android.gms.internal.measurement.zzhl r3, java.lang.String r4, java.lang.Object r5) {
            java.util.List r0 = r3.zzp()
            r1 = 0
        L5:
            int r2 = r0.size()
            if (r1 >= r2) goto L1f
            java.lang.Object r2 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzhq r2 = (com.google.android.gms.internal.measurement.zzhq) r2
            java.lang.String r2 = r2.zzg()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1c
            goto L20
        L1c:
            int r1 = r1 + 1
            goto L5
        L1f:
            r1 = -1
        L20:
            com.google.android.gms.internal.measurement.zzhp r0 = com.google.android.gms.internal.measurement.zzhq.zze()
            r0.zzj(r4)
            java.lang.Long r5 = (java.lang.Long) r5
            long r4 = r5.longValue()
            r0.zzi(r4)
            if (r1 < 0) goto L36
            r3.zzj(r1, r0)
            return
        L36:
            r3.zze(r0)
            return
    }

    static final boolean zzE(com.google.android.gms.measurement.internal.zzbh r0, com.google.android.gms.measurement.internal.zzr r1) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r0 = r1.zzb
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L18
            java.lang.String r0 = r1.zzp
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L18
            r0 = 0
            return r0
        L18:
            r0 = 1
            return r0
    }

    static final android.os.Bundle zzF(java.util.List r5) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r5.next()
            com.google.android.gms.internal.measurement.zzhq r1 = (com.google.android.gms.internal.measurement.zzhq) r1
            java.lang.String r2 = r1.zzg()
            boolean r3 = r1.zzu()
            if (r3 == 0) goto L27
            double r3 = r1.zza()
            r0.putDouble(r2, r3)
            goto L9
        L27:
            boolean r3 = r1.zzv()
            if (r3 == 0) goto L35
            float r1 = r1.zzb()
            r0.putFloat(r2, r1)
            goto L9
        L35:
            boolean r3 = r1.zzy()
            if (r3 == 0) goto L43
            java.lang.String r1 = r1.zzh()
            r0.putString(r2, r1)
            goto L9
        L43:
            boolean r3 = r1.zzw()
            if (r3 == 0) goto L9
            long r3 = r1.zzd()
            r0.putLong(r2, r3)
            goto L9
        L51:
            return r0
    }

    static final com.google.android.gms.internal.measurement.zzhq zzG(com.google.android.gms.internal.measurement.zzhm r2, java.lang.String r3) {
            java.util.List r2 = r2.zzi()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.next()
            com.google.android.gms.internal.measurement.zzhq r0 = (com.google.android.gms.internal.measurement.zzhq) r0
            java.lang.String r1 = r0.zzg()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L8
            return r0
        L1f:
            r2 = 0
            return r2
    }

    static final java.lang.Object zzH(com.google.android.gms.internal.measurement.zzhm r0, java.lang.String r1) {
            com.google.android.gms.internal.measurement.zzhq r0 = zzG(r0, r1)
            if (r0 == 0) goto L3e
            boolean r1 = r0.zzy()
            if (r1 == 0) goto L11
            java.lang.String r0 = r0.zzh()
            return r0
        L11:
            boolean r1 = r0.zzw()
            if (r1 == 0) goto L20
            long r0 = r0.zzd()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L20:
            boolean r1 = r0.zzu()
            if (r1 == 0) goto L2f
            double r0 = r0.zza()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L2f:
            int r1 = r0.zzc()
            if (r1 <= 0) goto L3e
            java.util.List r0 = r0.zzi()
            android.os.Bundle[] r0 = zzC(r0)
            return r0
        L3e:
            r0 = 0
            return r0
    }

    static final java.lang.Object zzI(com.google.android.gms.internal.measurement.zzhm r0, java.lang.String r1, java.lang.Object r2) {
            java.lang.Object r0 = zzH(r0, r1)
            if (r0 != 0) goto L7
            return r2
        L7:
            return r0
    }

    private final void zzJ(java.lang.StringBuilder r6, int r7, java.util.List r8) {
            r5 = this;
            if (r8 != 0) goto L4
            goto L8c
        L4:
            int r7 = r7 + 1
            java.util.Iterator r8 = r8.iterator()
        La:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r8.next()
            com.google.android.gms.internal.measurement.zzhq r0 = (com.google.android.gms.internal.measurement.zzhq) r0
            if (r0 == 0) goto La
            zzL(r6, r7)
            java.lang.String r1 = "param {\n"
            r6.append(r1)
            boolean r1 = r0.zzx()
            r2 = 0
            if (r1 == 0) goto L36
            com.google.android.gms.measurement.internal.zzio r1 = r5.zzu
            com.google.android.gms.measurement.internal.zzgx r1 = r1.zzj()
            java.lang.String r3 = r0.zzg()
            java.lang.String r1 = r1.zze(r3)
            goto L37
        L36:
            r1 = r2
        L37:
            java.lang.String r3 = "name"
            zzQ(r6, r7, r3, r1)
            boolean r1 = r0.zzy()
            if (r1 == 0) goto L47
            java.lang.String r1 = r0.zzh()
            goto L48
        L47:
            r1 = r2
        L48:
            java.lang.String r3 = "string_value"
            zzQ(r6, r7, r3, r1)
            boolean r1 = r0.zzw()
            if (r1 == 0) goto L5c
            long r3 = r0.zzd()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L5d
        L5c:
            r1 = r2
        L5d:
            java.lang.String r3 = "int_value"
            zzQ(r6, r7, r3, r1)
            boolean r1 = r0.zzu()
            if (r1 == 0) goto L70
            double r1 = r0.zza()
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
        L70:
            java.lang.String r1 = "double_value"
            zzQ(r6, r7, r1, r2)
            int r1 = r0.zzc()
            if (r1 <= 0) goto L82
            java.util.List r0 = r0.zzi()
            r5.zzJ(r6, r7, r0)
        L82:
            zzL(r6, r7)
            java.lang.String r0 = "}\n"
            r6.append(r0)
            goto La
        L8c:
            return
    }

    private final void zzK(java.lang.StringBuilder r6, int r7, com.google.android.gms.internal.measurement.zzfl r8) {
            r5 = this;
            if (r8 != 0) goto L3
            return
        L3:
            zzL(r6, r7)
            java.lang.String r0 = "filter {\n"
            r6.append(r0)
            boolean r0 = r8.zzh()
            if (r0 == 0) goto L1e
            boolean r0 = r8.zzg()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "complement"
            zzQ(r6, r7, r1, r0)
        L1e:
            boolean r0 = r8.zzj()
            if (r0 == 0) goto L37
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            com.google.android.gms.measurement.internal.zzgx r0 = r0.zzj()
            java.lang.String r1 = r8.zze()
            java.lang.String r0 = r0.zze(r1)
            java.lang.String r1 = "param_name"
            zzQ(r6, r7, r1, r0)
        L37:
            boolean r0 = r8.zzk()
            java.lang.String r1 = "}\n"
            if (r0 == 0) goto Ld4
            int r0 = r7 + 1
            com.google.android.gms.internal.measurement.zzfv r2 = r8.zzd()
            if (r2 != 0) goto L49
            goto Ld4
        L49:
            zzL(r6, r0)
            java.lang.String r3 = "string_filter {\n"
            r6.append(r3)
            boolean r3 = r2.zzi()
            if (r3 == 0) goto L77
            int r3 = r2.zzj()
            switch(r3) {
                case 1: goto L70;
                case 2: goto L6d;
                case 3: goto L6a;
                case 4: goto L67;
                case 5: goto L64;
                case 6: goto L61;
                default: goto L5e;
            }
        L5e:
            java.lang.String r3 = "IN_LIST"
            goto L72
        L61:
            java.lang.String r3 = "EXACT"
            goto L72
        L64:
            java.lang.String r3 = "PARTIAL"
            goto L72
        L67:
            java.lang.String r3 = "ENDS_WITH"
            goto L72
        L6a:
            java.lang.String r3 = "BEGINS_WITH"
            goto L72
        L6d:
            java.lang.String r3 = "REGEXP"
            goto L72
        L70:
            java.lang.String r3 = "UNKNOWN_MATCH_TYPE"
        L72:
            java.lang.String r4 = "match_type"
            zzQ(r6, r0, r4, r3)
        L77:
            boolean r3 = r2.zzh()
            if (r3 == 0) goto L86
            java.lang.String r3 = r2.zzd()
            java.lang.String r4 = "expression"
            zzQ(r6, r0, r4, r3)
        L86:
            boolean r3 = r2.zzg()
            if (r3 == 0) goto L99
            boolean r3 = r2.zzf()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "case_sensitive"
            zzQ(r6, r0, r4, r3)
        L99:
            int r3 = r2.zza()
            if (r3 <= 0) goto Lce
            int r3 = r0 + 1
            zzL(r6, r3)
            java.lang.String r3 = "expression_list {\n"
            r6.append(r3)
            java.util.List r2 = r2.zze()
            java.util.Iterator r2 = r2.iterator()
        Lb1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lcb
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r0 + 2
            zzL(r6, r4)
            r6.append(r3)
            java.lang.String r3 = "\n"
            r6.append(r3)
            goto Lb1
        Lcb:
            r6.append(r1)
        Lce:
            zzL(r6, r0)
            r6.append(r1)
        Ld4:
            boolean r0 = r8.zzi()
            if (r0 == 0) goto Le5
            int r0 = r7 + 1
            com.google.android.gms.internal.measurement.zzfp r8 = r8.zzc()
            java.lang.String r2 = "number_filter"
            zzR(r6, r0, r2, r8)
        Le5:
            zzL(r6, r7)
            r6.append(r1)
            return
    }

    private static final void zzL(java.lang.StringBuilder r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto Lb
            java.lang.String r1 = "  "
            r2.append(r1)
            int r0 = r0 + 1
            goto L1
        Lb:
            return
    }

    private static final void zzM(android.net.Uri.Builder r0, java.lang.String r1, java.lang.String r2, java.util.Set r3) {
            boolean r3 = r3.contains(r1)
            if (r3 != 0) goto L10
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto Ld
            goto L10
        Ld:
            r0.appendQueryParameter(r1, r2)
        L10:
            return
    }

    private static final java.lang.String zzN(boolean r1, boolean r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r1 == 0) goto Lc
            java.lang.String r1 = "Dynamic "
            r0.append(r1)
        Lc:
            if (r2 == 0) goto L13
            java.lang.String r1 = "Sequence "
            r0.append(r1)
        L13:
            if (r3 == 0) goto L1a
            java.lang.String r1 = "Session-Scoped "
            r0.append(r1)
        L1a:
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static final void zzO(android.net.Uri.Builder r5, java.lang.String[] r6, android.os.Bundle r7, java.util.Set r8) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r6.length
            if (r1 >= r2) goto L20
            r2 = r6[r1]
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            r3 = r2[r0]
            int r4 = r2.length
            int r4 = r4 + (-1)
            r2 = r2[r4]
            java.lang.String r3 = r7.getString(r3)
            if (r3 == 0) goto L1d
            zzM(r5, r2, r3, r8)
        L1d:
            int r1 = r1 + 1
            goto L2
        L20:
            return
    }

    private static final void zzP(java.lang.StringBuilder r9, int r10, java.lang.String r11, com.google.android.gms.internal.measurement.zzic r12) {
            if (r12 != 0) goto L3
            return
        L3:
            r10 = 3
            zzL(r9, r10)
            r9.append(r11)
            java.lang.String r11 = " {\n"
            r9.append(r11)
            int r11 = r12.zzb()
            r0 = 10
            r1 = 4
            java.lang.String r2 = ", "
            r3 = 0
            if (r11 == 0) goto L47
            zzL(r9, r1)
            java.lang.String r11 = "results: "
            r9.append(r11)
            java.util.List r11 = r12.zzi()
            java.util.Iterator r11 = r11.iterator()
            r4 = 0
        L2c:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r5 = r11.next()
            java.lang.Long r5 = (java.lang.Long) r5
            int r6 = r4 + 1
            if (r4 == 0) goto L3f
            r9.append(r2)
        L3f:
            r9.append(r5)
            r4 = r6
            goto L2c
        L44:
            r9.append(r0)
        L47:
            int r11 = r12.zzd()
            if (r11 == 0) goto L79
            zzL(r9, r1)
            java.lang.String r11 = "status: "
            r9.append(r11)
            java.util.List r11 = r12.zzk()
            java.util.Iterator r11 = r11.iterator()
            r4 = 0
        L5e:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L76
            java.lang.Object r5 = r11.next()
            java.lang.Long r5 = (java.lang.Long) r5
            int r6 = r4 + 1
            if (r4 == 0) goto L71
            r9.append(r2)
        L71:
            r9.append(r5)
            r4 = r6
            goto L5e
        L76:
            r9.append(r0)
        L79:
            int r11 = r12.zza()
            r0 = 0
            java.lang.String r4 = "}\n"
            if (r11 == 0) goto Ld6
            zzL(r9, r1)
            java.lang.String r11 = "dynamic_filter_timestamps: {"
            r9.append(r11)
            java.util.List r11 = r12.zzh()
            java.util.Iterator r11 = r11.iterator()
            r5 = 0
        L93:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto Ld3
            java.lang.Object r6 = r11.next()
            com.google.android.gms.internal.measurement.zzhk r6 = (com.google.android.gms.internal.measurement.zzhk) r6
            int r7 = r5 + 1
            if (r5 == 0) goto La6
            r9.append(r2)
        La6:
            boolean r5 = r6.zzh()
            if (r5 == 0) goto Lb5
            int r5 = r6.zza()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto Lb6
        Lb5:
            r5 = r0
        Lb6:
            r9.append(r5)
            java.lang.String r5 = ":"
            r9.append(r5)
            boolean r5 = r6.zzg()
            if (r5 == 0) goto Lcd
            long r5 = r6.zzb()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto Lce
        Lcd:
            r5 = r0
        Lce:
            r9.append(r5)
            r5 = r7
            goto L93
        Ld3:
            r9.append(r4)
        Ld6:
            int r11 = r12.zzc()
            if (r11 == 0) goto L147
            zzL(r9, r1)
            java.lang.String r11 = "sequence_filter_timestamps: {"
            r9.append(r11)
            java.util.List r11 = r12.zzj()
            java.util.Iterator r11 = r11.iterator()
            r12 = 0
        Led:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L144
            java.lang.Object r1 = r11.next()
            com.google.android.gms.internal.measurement.zzie r1 = (com.google.android.gms.internal.measurement.zzie) r1
            int r5 = r12 + 1
            if (r12 == 0) goto L100
            r9.append(r2)
        L100:
            boolean r12 = r1.zzi()
            if (r12 == 0) goto L10f
            int r12 = r1.zzb()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L110
        L10f:
            r12 = r0
        L110:
            r9.append(r12)
            java.lang.String r12 = ": ["
            r9.append(r12)
            java.util.List r12 = r1.zzf()
            java.util.Iterator r12 = r12.iterator()
            r1 = 0
        L121:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L13d
            java.lang.Object r6 = r12.next()
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            int r8 = r1 + 1
            if (r1 == 0) goto L138
            r9.append(r2)
        L138:
            r9.append(r6)
            r1 = r8
            goto L121
        L13d:
            java.lang.String r12 = "]"
            r9.append(r12)
            r12 = r5
            goto Led
        L144:
            r9.append(r4)
        L147:
            zzL(r9, r10)
            r9.append(r4)
            return
    }

    private static final void zzQ(java.lang.StringBuilder r0, int r1, java.lang.String r2, java.lang.Object r3) {
            if (r3 != 0) goto L3
            return
        L3:
            int r1 = r1 + 1
            zzL(r0, r1)
            r0.append(r2)
            java.lang.String r1 = ": "
            r0.append(r1)
            r0.append(r3)
            r1 = 10
            r0.append(r1)
            return
    }

    private static final void zzR(java.lang.StringBuilder r1, int r2, java.lang.String r3, com.google.android.gms.internal.measurement.zzfp r4) {
            if (r4 != 0) goto L3
            return
        L3:
            zzL(r1, r2)
            r1.append(r3)
            java.lang.String r3 = " {\n"
            r1.append(r3)
            boolean r3 = r4.zzg()
            if (r3 == 0) goto L37
            int r3 = r4.zzm()
            r0 = 1
            if (r3 == r0) goto L30
            r0 = 2
            if (r3 == r0) goto L2d
            r0 = 3
            if (r3 == r0) goto L2a
            r0 = 4
            if (r3 == r0) goto L27
            java.lang.String r3 = "BETWEEN"
            goto L32
        L27:
            java.lang.String r3 = "EQUAL"
            goto L32
        L2a:
            java.lang.String r3 = "GREATER_THAN"
            goto L32
        L2d:
            java.lang.String r3 = "LESS_THAN"
            goto L32
        L30:
            java.lang.String r3 = "UNKNOWN_COMPARISON_TYPE"
        L32:
            java.lang.String r0 = "comparison_type"
            zzQ(r1, r2, r0, r3)
        L37:
            boolean r3 = r4.zzi()
            if (r3 == 0) goto L4a
            boolean r3 = r4.zzf()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "match_as_float"
            zzQ(r1, r2, r0, r3)
        L4a:
            boolean r3 = r4.zzh()
            if (r3 == 0) goto L59
            java.lang.String r3 = r4.zzc()
            java.lang.String r0 = "comparison_value"
            zzQ(r1, r2, r0, r3)
        L59:
            boolean r3 = r4.zzk()
            if (r3 == 0) goto L68
            java.lang.String r3 = r4.zze()
            java.lang.String r0 = "min_comparison_value"
            zzQ(r1, r2, r0, r3)
        L68:
            boolean r3 = r4.zzj()
            if (r3 == 0) goto L77
            java.lang.String r3 = r4.zzd()
            java.lang.String r4 = "max_comparison_value"
            zzQ(r1, r2, r4, r3)
        L77:
            zzL(r1, r2)
            java.lang.String r2 = "}\n"
            r1.append(r2)
            return
    }

    static int zza(com.google.android.gms.internal.measurement.zzhw r2, java.lang.String r3) {
            r0 = 0
        L1:
            int r1 = r2.zzd()
            if (r0 >= r1) goto L19
            com.google.android.gms.internal.measurement.zzio r1 = r2.zzaE(r0)
            java.lang.String r1 = r1.zzg()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L16
            return r0
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r2 = -1
            return r2
    }

    static com.google.android.gms.internal.measurement.zzng zzp(com.google.android.gms.internal.measurement.zzng r1, byte[] r2) throws com.google.android.gms.internal.measurement.zzmm {
            com.google.android.gms.internal.measurement.zzlp r0 = com.google.android.gms.internal.measurement.zzlp.zza()
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.measurement.zzng r1 = r1.zzaV(r2, r0)
            return r1
        Lb:
            com.google.android.gms.internal.measurement.zzng r1 = r1.zzaU(r2)
            return r1
    }

    static java.util.List zzu(java.util.BitSet r10) {
            int r0 = r10.length()
            int r0 = r0 + 63
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 64
            int r0 = r0 / r2
            r1.<init>(r0)
            r3 = 0
            r4 = 0
        L10:
            if (r4 >= r0) goto L38
            r5 = 0
            r7 = 0
        L15:
            if (r7 >= r2) goto L2e
            int r8 = r4 * 64
            int r9 = r10.length()
            int r8 = r8 + r7
            if (r8 < r9) goto L21
            goto L2e
        L21:
            boolean r8 = r10.get(r8)
            if (r8 == 0) goto L2b
            r8 = 1
            long r8 = r8 << r7
            long r5 = r5 | r8
        L2b:
            int r7 = r7 + 1
            goto L15
        L2e:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r1.add(r5)
            int r4 = r4 + 1
            goto L10
        L38:
            return r1
    }

    static boolean zzy(java.util.List r4, int r5) {
            int r0 = r4.size()
            int r0 = r0 * 64
            if (r5 >= r0) goto L23
            int r0 = r5 / 64
            java.lang.Object r4 = r4.get(r0)
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            r2 = 1
            int r5 = r5 % 64
            long r4 = r2 << r5
            long r4 = r4 & r0
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L23
            r4 = 1
            return r4
        L23:
            r4 = 0
            return r4
    }

    final byte[] zzB(byte[] r3) throws java.io.IOException {
            r2 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L18
            r0.<init>()     // Catch: java.io.IOException -> L18
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch: java.io.IOException -> L18
            r1.<init>(r0)     // Catch: java.io.IOException -> L18
            r1.write(r3)     // Catch: java.io.IOException -> L18
            r1.close()     // Catch: java.io.IOException -> L18
            r0.close()     // Catch: java.io.IOException -> L18
            byte[] r3 = r0.toByteArray()     // Catch: java.io.IOException -> L18
            return r3
        L18:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Failed to gzip content"
            r0.zzb(r1, r3)
            throw r3
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
            r1 = this;
            r0 = 0
            return r0
    }

    final long zzd(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L9
            r0 = 0
            return r0
        L9:
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            byte[] r3 = r3.getBytes(r0)
            long r0 = r2.zzf(r3)
            return r0
    }

    final long zzf(byte[] r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzqf r1 = r0.zzw()
            r1.zzg()
            java.security.MessageDigest r1 = com.google.android.gms.measurement.internal.zzqf.zzI()
            if (r1 != 0) goto L22
            com.google.android.gms.measurement.internal.zzhe r3 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.String r0 = "Failed to get MD5"
            r3.zza(r0)
            r0 = 0
            return r0
        L22:
            byte[] r3 = r1.digest(r3)
            long r0 = com.google.android.gms.measurement.internal.zzqf.zzr(r3)
            return r0
    }

    final android.os.Bundle zzh(java.util.Map r10, boolean r11) {
            r9 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            if (r3 != 0) goto L24
            r3 = 0
            r0.putString(r2, r3)
            goto Ld
        L24:
            boolean r4 = r3 instanceof java.lang.Long
            if (r4 == 0) goto L32
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.putLong(r2, r3)
            goto Ld
        L32:
            boolean r4 = r3 instanceof java.lang.Double
            if (r4 == 0) goto L40
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r0.putDouble(r2, r3)
            goto Ld
        L40:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L71
            if (r11 == 0) goto Ld
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r3.size()
            r6 = 0
            r7 = 0
        L53:
            if (r7 >= r5) goto L65
            java.lang.Object r8 = r3.get(r7)
            java.util.Map r8 = (java.util.Map) r8
            android.os.Bundle r8 = r9.zzh(r8, r6)
            r4.add(r8)
            int r7 = r7 + 1
            goto L53
        L65:
            android.os.Parcelable[] r3 = new android.os.Parcelable[r6]
            java.lang.Object[] r3 = r4.toArray(r3)
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            r0.putParcelableArray(r2, r3)
            goto Ld
        L71:
            java.lang.String r3 = r3.toString()
            r0.putString(r2, r3)
            goto Ld
        L79:
            return r0
    }

    final android.os.Parcelable zzi(byte[] r5, android.os.Parcelable.Creator r6) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch: java.lang.Throwable -> L18 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L1a
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch: java.lang.Throwable -> L18 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L1a
            r1.setDataPosition(r3)     // Catch: java.lang.Throwable -> L18 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L1a
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch: java.lang.Throwable -> L18 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L1a
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch: java.lang.Throwable -> L18 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L1a
            r0 = r5
            goto L29
        L18:
            r5 = move-exception
            goto L2d
        L1a:
            com.google.android.gms.measurement.internal.zzio r5 = r4.zzu     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.zza(r6)     // Catch: java.lang.Throwable -> L18
        L29:
            r1.recycle()
            return r0
        L2d:
            r1.recycle()
            throw r5
    }

    final com.google.android.gms.measurement.internal.zzbh zzj(com.google.android.gms.internal.measurement.zzaa r9) {
            r8 = this;
            java.util.Map r0 = r9.zzf()
            r1 = 1
            android.os.Bundle r0 = r8.zzh(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L1c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L1c
            java.lang.String r1 = r1.toString()
            goto L1e
        L1c:
            java.lang.String r1 = "app"
        L1e:
            r5 = r1
            java.lang.String r1 = r9.zze()
            java.lang.String r1 = com.google.android.gms.measurement.internal.zzjy.zzb(r1)
            if (r1 != 0) goto L2d
            java.lang.String r1 = r9.zze()
        L2d:
            r3 = r1
            com.google.android.gms.measurement.internal.zzbh r1 = new com.google.android.gms.measurement.internal.zzbh
            com.google.android.gms.measurement.internal.zzbf r4 = new com.google.android.gms.measurement.internal.zzbf
            r4.<init>(r0)
            long r6 = r9.zza()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
    }

    @android.annotation.TargetApi(30)
    final com.google.android.gms.measurement.internal.zzov zzl(java.lang.String r18, com.google.android.gms.internal.measurement.zzhw r19, com.google.android.gms.internal.measurement.zzhl r20, java.lang.String r21) {
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.gms.internal.measurement.zzqr.zzb()
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r3 = r2.zzf()
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzaV
            boolean r3 = r3.zzx(r1, r4)
            if (r3 == 0) goto L352
            com.google.android.gms.common.util.Clock r3 = r2.zzaU()
            long r3 = r3.currentTimeMillis()
            com.google.android.gms.measurement.internal.zzam r5 = r2.zzf()
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzat
            java.lang.String r5 = r5.zzr(r1, r6)
            java.lang.String r6 = ","
            java.lang.String[] r5 = r5.split(r6)
            java.util.HashSet r6 = new java.util.HashSet
            int r7 = r5.length
            r6.<init>(r7)
            r8 = 0
            r9 = 0
        L35:
            if (r9 >= r7) goto L51
            r10 = r5[r9]
            java.util.Objects.requireNonNull(r10)
            boolean r11 = r6.add(r10)
            if (r11 == 0) goto L45
            int r9 = r9 + 1
            goto L35
        L45:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "duplicate element: "
            java.lang.String r2 = r2.concat(r10)
            r1.<init>(r2)
            throw r1
        L51:
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r6)
            com.google.android.gms.measurement.internal.zzpv r6 = r0.zzg
            com.google.android.gms.measurement.internal.zzpi r7 = r6.zzy()
            com.google.android.gms.measurement.internal.zzpv r9 = r7.zzg
            com.google.android.gms.measurement.internal.zzif r9 = r9.zzr()
            java.lang.String r9 = r9.zzm(r1)
            android.net.Uri$Builder r10 = new android.net.Uri$Builder
            r10.<init>()
            com.google.android.gms.measurement.internal.zzio r7 = r7.zzu
            com.google.android.gms.measurement.internal.zzam r11 = r7.zzf()
            com.google.android.gms.measurement.internal.zzgg r12 = com.google.android.gms.measurement.internal.zzgi.zzam
            java.lang.String r11 = r11.zzr(r1, r12)
            r10.scheme(r11)
            boolean r11 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r12 = "."
            if (r11 != 0) goto La1
            com.google.android.gms.measurement.internal.zzam r11 = r7.zzf()
            com.google.android.gms.measurement.internal.zzgg r13 = com.google.android.gms.measurement.internal.zzgi.zzan
            java.lang.String r11 = r11.zzr(r1, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            r13.append(r12)
            r13.append(r11)
            java.lang.String r9 = r13.toString()
            r10.authority(r9)
            goto Lae
        La1:
            com.google.android.gms.measurement.internal.zzam r9 = r7.zzf()
            com.google.android.gms.measurement.internal.zzgg r11 = com.google.android.gms.measurement.internal.zzgi.zzan
            java.lang.String r9 = r9.zzr(r1, r11)
            r10.authority(r9)
        Lae:
            com.google.android.gms.measurement.internal.zzam r7 = r7.zzf()
            com.google.android.gms.measurement.internal.zzgg r9 = com.google.android.gms.measurement.internal.zzgi.zzao
            java.lang.String r7 = r7.zzr(r1, r9)
            r10.path(r7)
            java.lang.String r7 = r19.zzaJ()
            java.lang.String r9 = "gmp_app_id"
            zzM(r10, r9, r7, r5)
            com.google.android.gms.measurement.internal.zzam r7 = r2.zzf()
            r7.zzj()
            r13 = 119002(0x1d0da, double:5.8795E-319)
            java.lang.String r7 = java.lang.String.valueOf(r13)
            java.lang.String r9 = "gmp_version"
            zzM(r10, r9, r7, r5)
            java.lang.String r7 = r19.zzaG()
            com.google.android.gms.measurement.internal.zzam r9 = r2.zzf()
            com.google.android.gms.measurement.internal.zzgg r11 = com.google.android.gms.measurement.internal.zzgi.zzaY
            boolean r9 = r9.zzx(r1, r11)
            if (r9 == 0) goto Lf3
            com.google.android.gms.measurement.internal.zzif r9 = r6.zzr()
            boolean r9 = r9.zzA(r1)
            if (r9 == 0) goto Lf3
            java.lang.String r7 = ""
        Lf3:
            java.lang.String r9 = "app_instance_id"
            zzM(r10, r9, r7, r5)
            java.lang.String r7 = r19.zzaL()
            java.lang.String r9 = "rdid"
            zzM(r10, r9, r7, r5)
            java.lang.String r7 = r19.zzaF()
            java.lang.String r9 = "bundle_id"
            zzM(r10, r9, r7, r5)
            java.lang.String r7 = r20.zzo()
            java.lang.String r9 = com.google.android.gms.measurement.internal.zzjy.zza(r7)
            boolean r13 = android.text.TextUtils.isEmpty(r9)
            r14 = 1
            if (r14 == r13) goto L11a
            r7 = r9
        L11a:
            java.lang.String r9 = "app_event_name"
            zzM(r10, r9, r7, r5)
            int r7 = r19.zzb()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r9 = "app_version"
            zzM(r10, r9, r7, r5)
            java.lang.String r7 = r19.zzaK()
            com.google.android.gms.measurement.internal.zzam r9 = r2.zzf()
            boolean r9 = r9.zzx(r1, r11)
            if (r9 == 0) goto L155
            com.google.android.gms.measurement.internal.zzif r6 = r6.zzr()
            boolean r6 = r6.zzE(r1)
            if (r6 == 0) goto L155
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 != 0) goto L155
            int r6 = r7.indexOf(r12)
            r9 = -1
            if (r6 == r9) goto L155
            java.lang.String r7 = r7.substring(r8, r6)
        L155:
            java.lang.String r6 = "os_version"
            zzM(r10, r6, r7, r5)
            long r6 = r20.zzc()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "timestamp"
            zzM(r10, r7, r6, r5)
            boolean r6 = r19.zzaP()
            java.lang.String r7 = "1"
            if (r6 == 0) goto L174
            java.lang.String r6 = "lat"
            zzM(r10, r6, r7, r5)
        L174:
            int r6 = r19.zza()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "privacy_sandbox_version"
            zzM(r10, r8, r6, r5)
            java.lang.String r6 = "trigger_uri_source"
            zzM(r10, r6, r7, r5)
            java.lang.String r6 = java.lang.String.valueOf(r3)
            java.lang.String r8 = "trigger_uri_timestamp"
            zzM(r10, r8, r6, r5)
            java.lang.String r6 = "request_uuid"
            r8 = r21
            zzM(r10, r6, r8, r5)
            java.util.List r6 = r20.zzp()
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1a3:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L1f7
            java.lang.Object r9 = r6.next()
            com.google.android.gms.internal.measurement.zzhq r9 = (com.google.android.gms.internal.measurement.zzhq) r9
            java.lang.String r11 = r9.zzg()
            boolean r12 = r9.zzu()
            if (r12 == 0) goto L1c5
            double r12 = r9.zza()
            java.lang.String r9 = java.lang.String.valueOf(r12)
            r8.putString(r11, r9)
            goto L1a3
        L1c5:
            boolean r12 = r9.zzv()
            if (r12 == 0) goto L1d7
            float r9 = r9.zzb()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.putString(r11, r9)
            goto L1a3
        L1d7:
            boolean r12 = r9.zzy()
            if (r12 == 0) goto L1e5
            java.lang.String r9 = r9.zzh()
            r8.putString(r11, r9)
            goto L1a3
        L1e5:
            boolean r12 = r9.zzw()
            if (r12 == 0) goto L1a3
            long r12 = r9.zzd()
            java.lang.String r9 = java.lang.String.valueOf(r12)
            r8.putString(r11, r9)
            goto L1a3
        L1f7:
            com.google.android.gms.measurement.internal.zzam r6 = r2.zzf()
            com.google.android.gms.measurement.internal.zzgg r9 = com.google.android.gms.measurement.internal.zzgi.zzas
            java.lang.String r6 = r6.zzr(r1, r9)
            java.lang.String r9 = "\\|"
            java.lang.String[] r6 = r6.split(r9)
            zzO(r10, r6, r8, r5)
            java.util.List r6 = r19.zzaN()
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        L217:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L26b
            java.lang.Object r11 = r6.next()
            com.google.android.gms.internal.measurement.zzio r11 = (com.google.android.gms.internal.measurement.zzio) r11
            java.lang.String r12 = r11.zzg()
            boolean r13 = r11.zzr()
            if (r13 == 0) goto L239
            double r15 = r11.zza()
            java.lang.String r11 = java.lang.String.valueOf(r15)
            r8.putString(r12, r11)
            goto L217
        L239:
            boolean r13 = r11.zzs()
            if (r13 == 0) goto L24b
            float r11 = r11.zzb()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r8.putString(r12, r11)
            goto L217
        L24b:
            boolean r13 = r11.zzv()
            if (r13 == 0) goto L259
            java.lang.String r11 = r11.zzh()
            r8.putString(r12, r11)
            goto L217
        L259:
            boolean r13 = r11.zzt()
            if (r13 == 0) goto L217
            long r15 = r11.zzc()
            java.lang.String r11 = java.lang.String.valueOf(r15)
            r8.putString(r12, r11)
            goto L217
        L26b:
            com.google.android.gms.measurement.internal.zzam r2 = r2.zzf()
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzar
            java.lang.String r1 = r2.zzr(r1, r6)
            java.lang.String[] r1 = r1.split(r9)
            zzO(r10, r1, r8, r5)
            boolean r1 = r19.zzaO()
            if (r14 == r1) goto L284
            java.lang.String r7 = "0"
        L284:
            java.lang.String r1 = "dma"
            zzM(r10, r1, r7, r5)
            java.lang.String r1 = r19.zzaI()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L29c
            java.lang.String r1 = r19.zzaI()
            java.lang.String r2 = "dma_cps"
            zzM(r10, r2, r1, r5)
        L29c:
            boolean r1 = r19.zzaQ()
            if (r1 == 0) goto L344
            com.google.android.gms.internal.measurement.zzhc r1 = r19.zzg()
            java.lang.String r2 = r1.zzh()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L2b9
            java.lang.String r2 = r1.zzh()
            java.lang.String r6 = "dl_gclid"
            zzM(r10, r6, r2, r5)
        L2b9:
            java.lang.String r2 = r1.zzg()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L2cc
            java.lang.String r2 = r1.zzg()
            java.lang.String r6 = "dl_gbraid"
            zzM(r10, r6, r2, r5)
        L2cc:
            java.lang.String r2 = r1.zzf()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L2df
            java.lang.String r2 = r1.zzf()
            java.lang.String r6 = "dl_gs"
            zzM(r10, r6, r2, r5)
        L2df:
            long r6 = r1.zza()
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L2f6
            long r6 = r1.zza()
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r6 = "dl_ss_ts"
            zzM(r10, r6, r2, r5)
        L2f6:
            java.lang.String r2 = r1.zzk()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L309
            java.lang.String r2 = r1.zzk()
            java.lang.String r6 = "mr_gclid"
            zzM(r10, r6, r2, r5)
        L309:
            java.lang.String r2 = r1.zzj()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L31c
            java.lang.String r2 = r1.zzj()
            java.lang.String r6 = "mr_gbraid"
            zzM(r10, r6, r2, r5)
        L31c:
            java.lang.String r2 = r1.zzi()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L32f
            java.lang.String r2 = r1.zzi()
            java.lang.String r6 = "mr_gs"
            zzM(r10, r6, r2, r5)
        L32f:
            long r6 = r1.zzb()
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L344
            long r1 = r1.zzb()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "mr_click_ts"
            zzM(r10, r2, r1, r5)
        L344:
            com.google.android.gms.measurement.internal.zzov r1 = new com.google.android.gms.measurement.internal.zzov
            android.net.Uri r2 = r10.build()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r3, r14)
            return r1
        L352:
            r1 = 0
            return r1
    }

    final com.google.android.gms.internal.measurement.zzhm zzm(com.google.android.gms.measurement.internal.zzbc r6) {
            r5 = this;
            com.google.android.gms.internal.measurement.zzhl r0 = com.google.android.gms.internal.measurement.zzhm.zze()
            long r1 = r6.zze
            r0.zzl(r1)
            com.google.android.gms.measurement.internal.zzbe r1 = new com.google.android.gms.measurement.internal.zzbe
            com.google.android.gms.measurement.internal.zzbf r2 = r6.zzf
            r1.<init>(r2)
        L10:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2f
            java.lang.String r3 = r1.zza()
            com.google.android.gms.internal.measurement.zzhp r4 = com.google.android.gms.internal.measurement.zzhq.zze()
            r4.zzj(r3)
            java.lang.Object r3 = r2.zzf(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            r5.zzw(r4, r3)
            r0.zze(r4)
            goto L10
        L2f:
            java.lang.String r6 = r6.zzc
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L52
            java.lang.String r1 = "_o"
            java.lang.Object r2 = r2.zzf(r1)
            if (r2 != 0) goto L52
            com.google.android.gms.internal.measurement.zzhp r2 = com.google.android.gms.internal.measurement.zzhq.zze()
            r2.zzj(r1)
            r2.zzk(r6)
            com.google.android.gms.internal.measurement.zzmd r6 = r2.zzba()
            com.google.android.gms.internal.measurement.zzhq r6 = (com.google.android.gms.internal.measurement.zzhq) r6
            r0.zzf(r6)
        L52:
            com.google.android.gms.internal.measurement.zzmd r6 = r0.zzba()
            com.google.android.gms.internal.measurement.zzhm r6 = (com.google.android.gms.internal.measurement.zzhm) r6
            return r6
    }

    final java.lang.String zzq(com.google.android.gms.internal.measurement.zzhv r14) {
            r13 = this;
            if (r14 != 0) goto L5
            java.lang.String r14 = ""
            return r14
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\nbatch {\n"
            r0.append(r1)
            boolean r1 = r14.zzq()
            r2 = 0
            if (r1 == 0) goto L1f
            java.lang.String r1 = r14.zzg()
            java.lang.String r3 = "upload_subdomain"
            zzQ(r0, r2, r3, r1)
        L1f:
            boolean r1 = r14.zzp()
            if (r1 == 0) goto L2e
            java.lang.String r1 = r14.zzf()
            java.lang.String r3 = "sgtm_join_id"
            zzQ(r0, r2, r3, r1)
        L2e:
            java.util.List r14 = r14.zzh()
            java.util.Iterator r14 = r14.iterator()
        L36:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L5b3
            java.lang.Object r1 = r14.next()
            com.google.android.gms.internal.measurement.zzhx r1 = (com.google.android.gms.internal.measurement.zzhx) r1
            if (r1 == 0) goto L36
            r2 = 1
            zzL(r0, r2)
            java.lang.String r3 = "bundle {\n"
            r0.append(r3)
            boolean r3 = r1.zzbQ()
            if (r3 == 0) goto L60
            int r3 = r1.zzf()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "protocol_version"
            zzQ(r0, r2, r4, r3)
        L60:
            com.google.android.gms.internal.measurement.zzrd.zzb()
            com.google.android.gms.measurement.internal.zzio r3 = r13.zzu
            com.google.android.gms.measurement.internal.zzam r4 = r3.zzf()
            java.lang.String r5 = r1.zzF()
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzaL
            boolean r4 = r4.zzx(r5, r6)
            if (r4 == 0) goto L84
            boolean r4 = r1.zzbT()
            if (r4 == 0) goto L84
            java.lang.String r4 = r1.zzU()
            java.lang.String r5 = "session_stitching_token"
            zzQ(r0, r2, r5, r4)
        L84:
            java.lang.String r4 = r1.zzS()
            java.lang.String r5 = "platform"
            zzQ(r0, r2, r5, r4)
            boolean r4 = r1.zzbL()
            if (r4 == 0) goto La0
            long r4 = r1.zzp()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "gmp_version"
            zzQ(r0, r2, r5, r4)
        La0:
            boolean r4 = r1.zzbZ()
            if (r4 == 0) goto Lb3
            long r4 = r1.zzv()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "uploading_gmp_version"
            zzQ(r0, r2, r5, r4)
        Lb3:
            boolean r4 = r1.zzbJ()
            if (r4 == 0) goto Lc6
            long r4 = r1.zzn()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "dynamite_version"
            zzQ(r0, r2, r5, r4)
        Lc6:
            boolean r4 = r1.zzbC()
            if (r4 == 0) goto Ld9
            long r4 = r1.zzk()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "config_version"
            zzQ(r0, r2, r5, r4)
        Ld9:
            java.lang.String r4 = r1.zzP()
            java.lang.String r5 = "gmp_app_id"
            zzQ(r0, r2, r5, r4)
            java.lang.String r4 = r1.zzE()
            java.lang.String r5 = "admob_app_id"
            zzQ(r0, r2, r5, r4)
            java.lang.String r4 = r1.zzF()
            java.lang.String r5 = "app_id"
            zzQ(r0, r2, r5, r4)
            java.lang.String r4 = r1.zzI()
            java.lang.String r5 = "app_version"
            zzQ(r0, r2, r5, r4)
            boolean r4 = r1.zzby()
            if (r4 == 0) goto L110
            int r4 = r1.zzb()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "app_version_major"
            zzQ(r0, r2, r5, r4)
        L110:
            java.lang.String r4 = r1.zzO()
            java.lang.String r5 = "firebase_instance_id"
            zzQ(r0, r2, r5, r4)
            boolean r4 = r1.zzbH()
            if (r4 == 0) goto L12c
            long r4 = r1.zzm()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "dev_cert_hash"
            zzQ(r0, r2, r5, r4)
        L12c:
            java.lang.String r4 = r1.zzH()
            java.lang.String r5 = "app_store"
            zzQ(r0, r2, r5, r4)
            boolean r4 = r1.zzbY()
            if (r4 == 0) goto L148
            long r4 = r1.zzu()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "upload_timestamp_millis"
            zzQ(r0, r2, r5, r4)
        L148:
            boolean r4 = r1.zzbV()
            if (r4 == 0) goto L15b
            long r4 = r1.zzs()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "start_timestamp_millis"
            zzQ(r0, r2, r5, r4)
        L15b:
            boolean r4 = r1.zzbK()
            if (r4 == 0) goto L16e
            long r4 = r1.zzo()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "end_timestamp_millis"
            zzQ(r0, r2, r5, r4)
        L16e:
            boolean r4 = r1.zzbP()
            if (r4 == 0) goto L181
            long r4 = r1.zzr()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "previous_bundle_start_timestamp_millis"
            zzQ(r0, r2, r5, r4)
        L181:
            boolean r4 = r1.zzbO()
            if (r4 == 0) goto L194
            long r4 = r1.zzq()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "previous_bundle_end_timestamp_millis"
            zzQ(r0, r2, r5, r4)
        L194:
            java.lang.String r4 = r1.zzG()
            java.lang.String r5 = "app_instance_id"
            zzQ(r0, r2, r5, r4)
            java.lang.String r4 = r1.zzT()
            java.lang.String r5 = "resettable_device_id"
            zzQ(r0, r2, r5, r4)
            java.lang.String r4 = r1.zzN()
            java.lang.String r5 = "ds_id"
            zzQ(r0, r2, r5, r4)
            boolean r4 = r1.zzbN()
            if (r4 == 0) goto L1c2
            boolean r4 = r1.zzbv()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r5 = "limited_ad_tracking"
            zzQ(r0, r2, r5, r4)
        L1c2:
            java.lang.String r4 = r1.zzR()
            java.lang.String r5 = "os_version"
            zzQ(r0, r2, r5, r4)
            java.lang.String r4 = r1.zzM()
            java.lang.String r5 = "device_model"
            zzQ(r0, r2, r5, r4)
            java.lang.String r4 = r1.zzV()
            java.lang.String r5 = "user_default_language"
            zzQ(r0, r2, r5, r4)
            boolean r4 = r1.zzbX()
            if (r4 == 0) goto L1f0
            int r4 = r1.zzh()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "time_zone_offset_minutes"
            zzQ(r0, r2, r5, r4)
        L1f0:
            boolean r4 = r1.zzbB()
            if (r4 == 0) goto L203
            int r4 = r1.zzc()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "bundle_sequential_index"
            zzQ(r0, r2, r5, r4)
        L203:
            boolean r4 = r1.zzbG()
            if (r4 == 0) goto L216
            int r4 = r1.zzd()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "delivery_index"
            zzQ(r0, r2, r5, r4)
        L216:
            boolean r4 = r1.zzbS()
            if (r4 == 0) goto L229
            boolean r4 = r1.zzbw()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r5 = "service_upload"
            zzQ(r0, r2, r5, r4)
        L229:
            java.lang.String r4 = r1.zzQ()
            java.lang.String r5 = "health_monitor"
            zzQ(r0, r2, r5, r4)
            boolean r4 = r1.zzbR()
            if (r4 == 0) goto L245
            int r4 = r1.zzg()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "retry_counter"
            zzQ(r0, r2, r5, r4)
        L245:
            boolean r4 = r1.zzbE()
            if (r4 == 0) goto L254
            java.lang.String r4 = r1.zzK()
            java.lang.String r5 = "consent_signals"
            zzQ(r0, r2, r5, r4)
        L254:
            boolean r4 = r1.zzbM()
            if (r4 == 0) goto L267
            boolean r4 = r1.zzbu()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r5 = "is_dma_region"
            zzQ(r0, r2, r5, r4)
        L267:
            boolean r4 = r1.zzbF()
            if (r4 == 0) goto L276
            java.lang.String r4 = r1.zzL()
            java.lang.String r5 = "core_platform_services"
            zzQ(r0, r2, r5, r4)
        L276:
            boolean r4 = r1.zzbD()
            if (r4 == 0) goto L285
            java.lang.String r4 = r1.zzJ()
            java.lang.String r5 = "consent_diagnostics"
            zzQ(r0, r2, r5, r4)
        L285:
            boolean r4 = r1.zzbW()
            if (r4 == 0) goto L298
            long r4 = r1.zzt()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "target_os_version"
            zzQ(r0, r2, r5, r4)
        L298:
            com.google.android.gms.internal.measurement.zzqr.zzb()
            com.google.android.gms.measurement.internal.zzam r4 = r3.zzf()
            java.lang.String r5 = r1.zzF()
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzaV
            boolean r4 = r4.zzx(r5, r6)
            java.lang.String r5 = "}\n"
            r6 = 2
            if (r4 == 0) goto L330
            int r4 = r1.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r7 = "ad_services_version"
            zzQ(r0, r2, r7, r4)
            boolean r4 = r1.zzbz()
            if (r4 == 0) goto L330
            com.google.android.gms.internal.measurement.zzhg r4 = r1.zzx()
            if (r4 == 0) goto L330
            zzL(r0, r6)
            java.lang.String r7 = "attribution_eligibility_status {\n"
            r0.append(r7)
            boolean r7 = r4.zzn()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "eligible"
            zzQ(r0, r6, r8, r7)
            boolean r7 = r4.zzp()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "no_access_adservices_attribution_permission"
            zzQ(r0, r6, r8, r7)
            boolean r7 = r4.zzq()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "pre_r"
            zzQ(r0, r6, r8, r7)
            boolean r7 = r4.zzr()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "r_extensions_too_old"
            zzQ(r0, r6, r8, r7)
            boolean r7 = r4.zzm()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "adservices_extension_too_old"
            zzQ(r0, r6, r8, r7)
            boolean r7 = r4.zzk()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "ad_storage_not_allowed"
            zzQ(r0, r6, r8, r7)
            boolean r4 = r4.zzo()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r7 = "measurement_manager_disabled"
            zzQ(r0, r6, r7, r4)
            zzL(r0, r6)
            r0.append(r5)
        L330:
            boolean r4 = r1.zzbx()
            if (r4 == 0) goto L3c8
            com.google.android.gms.internal.measurement.zzhc r4 = r1.zzw()
            zzL(r0, r6)
            java.lang.String r7 = "ad_campaign_info {\n"
            r0.append(r7)
            boolean r7 = r4.zzC()
            if (r7 == 0) goto L351
            java.lang.String r7 = r4.zzh()
            java.lang.String r8 = "deep_link_gclid"
            zzQ(r0, r6, r8, r7)
        L351:
            boolean r7 = r4.zzB()
            if (r7 == 0) goto L360
            java.lang.String r7 = r4.zzg()
            java.lang.String r8 = "deep_link_gbraid"
            zzQ(r0, r6, r8, r7)
        L360:
            boolean r7 = r4.zzA()
            if (r7 == 0) goto L36f
            java.lang.String r7 = r4.zzf()
            java.lang.String r8 = "deep_link_gad_source"
            zzQ(r0, r6, r8, r7)
        L36f:
            boolean r7 = r4.zzD()
            if (r7 == 0) goto L382
            long r7 = r4.zza()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = "deep_link_session_millis"
            zzQ(r0, r6, r8, r7)
        L382:
            boolean r7 = r4.zzH()
            if (r7 == 0) goto L391
            java.lang.String r7 = r4.zzk()
            java.lang.String r8 = "market_referrer_gclid"
            zzQ(r0, r6, r8, r7)
        L391:
            boolean r7 = r4.zzG()
            if (r7 == 0) goto L3a0
            java.lang.String r7 = r4.zzj()
            java.lang.String r8 = "market_referrer_gbraid"
            zzQ(r0, r6, r8, r7)
        L3a0:
            boolean r7 = r4.zzF()
            if (r7 == 0) goto L3af
            java.lang.String r7 = r4.zzi()
            java.lang.String r8 = "market_referrer_gad_source"
            zzQ(r0, r6, r8, r7)
        L3af:
            boolean r7 = r4.zzE()
            if (r7 == 0) goto L3c2
            long r7 = r4.zzb()
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = "market_referrer_click_millis"
            zzQ(r0, r6, r7, r4)
        L3c2:
            zzL(r0, r6)
            r0.append(r5)
        L3c8:
            boolean r4 = r1.zzbA()
            if (r4 == 0) goto L3db
            long r7 = r1.zzj()
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = "batching_timestamp_millis"
            zzQ(r0, r2, r7, r4)
        L3db:
            boolean r4 = r1.zzbU()
            if (r4 == 0) goto L446
            com.google.android.gms.internal.measurement.zzim r4 = r1.zzC()
            zzL(r0, r6)
            java.lang.String r7 = "sgtm_diagnostics {\n"
            r0.append(r7)
            int r7 = r4.zzg()
            r8 = 4
            r9 = 3
            if (r7 == r2) goto L407
            if (r7 == r6) goto L404
            if (r7 == r9) goto L401
            if (r7 == r8) goto L3fe
            java.lang.String r7 = "SDK_SERVICE_UPLOAD"
            goto L409
        L3fe:
            java.lang.String r7 = "PACKAGE_SERVICE_UPLOAD"
            goto L409
        L401:
            java.lang.String r7 = "SDK_CLIENT_UPLOAD"
            goto L409
        L404:
            java.lang.String r7 = "GA_UPLOAD"
            goto L409
        L407:
            java.lang.String r7 = "UPLOAD_TYPE_UNKNOWN"
        L409:
            java.lang.String r10 = "upload_type"
            zzQ(r0, r6, r10, r7)
            com.google.android.gms.internal.measurement.zzih r7 = r4.zzb()
            java.lang.String r7 = r7.name()
            java.lang.String r10 = "client_upload_eligibility"
            zzQ(r0, r6, r10, r7)
            int r4 = r4.zzf()
            if (r4 == r2) goto L439
            if (r4 == r6) goto L436
            if (r4 == r9) goto L433
            if (r4 == r8) goto L430
            r7 = 5
            if (r4 == r7) goto L42d
            java.lang.String r4 = "NON_PLAY_MISSING_SGTM_SERVER_URL"
            goto L43b
        L42d:
            java.lang.String r4 = "MISSING_SGTM_PROXY_INFO"
            goto L43b
        L430:
            java.lang.String r4 = "MISSING_SGTM_SETTINGS"
            goto L43b
        L433:
            java.lang.String r4 = "NOT_IN_ROLLOUT"
            goto L43b
        L436:
            java.lang.String r4 = "SERVICE_UPLOAD_ELIGIBLE"
            goto L43b
        L439:
            java.lang.String r4 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN"
        L43b:
            java.lang.String r7 = "service_upload_eligibility"
            zzQ(r0, r6, r7, r4)
            zzL(r0, r6)
            r0.append(r5)
        L446:
            java.util.List r4 = r1.zzY()
            java.lang.String r7 = "name"
            if (r4 != 0) goto L450
            goto L4c7
        L450:
            java.util.Iterator r4 = r4.iterator()
        L454:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L4c7
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.measurement.zzio r8 = (com.google.android.gms.internal.measurement.zzio) r8
            if (r8 == 0) goto L454
            zzL(r0, r6)
            java.lang.String r9 = "user_property {\n"
            r0.append(r9)
            boolean r9 = r8.zzu()
            r10 = 0
            if (r9 == 0) goto L47a
            long r11 = r8.zzd()
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            goto L47b
        L47a:
            r9 = r10
        L47b:
            java.lang.String r11 = "set_timestamp_millis"
            zzQ(r0, r6, r11, r9)
            com.google.android.gms.measurement.internal.zzgx r9 = r3.zzj()
            java.lang.String r11 = r8.zzg()
            java.lang.String r9 = r9.zzf(r11)
            zzQ(r0, r6, r7, r9)
            java.lang.String r9 = r8.zzh()
            java.lang.String r11 = "string_value"
            zzQ(r0, r6, r11, r9)
            boolean r9 = r8.zzt()
            if (r9 == 0) goto L4a7
            long r11 = r8.zzc()
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            goto L4a8
        L4a7:
            r9 = r10
        L4a8:
            java.lang.String r11 = "int_value"
            zzQ(r0, r6, r11, r9)
            boolean r9 = r8.zzr()
            if (r9 == 0) goto L4bb
            double r8 = r8.zza()
            java.lang.Double r10 = java.lang.Double.valueOf(r8)
        L4bb:
            java.lang.String r8 = "double_value"
            zzQ(r0, r6, r8, r10)
            zzL(r0, r6)
            r0.append(r5)
            goto L454
        L4c7:
            java.util.List r4 = r1.zzW()
            if (r4 != 0) goto L4ce
            goto L52d
        L4ce:
            java.util.Iterator r4 = r4.iterator()
        L4d2:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L52d
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.measurement.zzhi r8 = (com.google.android.gms.internal.measurement.zzhi) r8
            if (r8 == 0) goto L4d2
            zzL(r0, r6)
            java.lang.String r9 = "audience_membership {\n"
            r0.append(r9)
            boolean r9 = r8.zzk()
            if (r9 == 0) goto L4fb
            int r9 = r8.zza()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "audience_id"
            zzQ(r0, r6, r10, r9)
        L4fb:
            boolean r9 = r8.zzm()
            if (r9 == 0) goto L50e
            boolean r9 = r8.zzj()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.String r10 = "new_audience"
            zzQ(r0, r6, r10, r9)
        L50e:
            com.google.android.gms.internal.measurement.zzic r9 = r8.zzd()
            java.lang.String r10 = "current_data"
            zzP(r0, r6, r10, r9)
            boolean r9 = r8.zzn()
            if (r9 == 0) goto L526
            com.google.android.gms.internal.measurement.zzic r8 = r8.zze()
            java.lang.String r9 = "previous_data"
            zzP(r0, r6, r9, r8)
        L526:
            zzL(r0, r6)
            r0.append(r5)
            goto L4d2
        L52d:
            java.util.List r1 = r1.zzX()
            if (r1 != 0) goto L535
            goto L5ab
        L535:
            java.util.Iterator r1 = r1.iterator()
        L539:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5ab
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.measurement.zzhm r4 = (com.google.android.gms.internal.measurement.zzhm) r4
            if (r4 == 0) goto L539
            zzL(r0, r6)
            java.lang.String r8 = "event {\n"
            r0.append(r8)
            com.google.android.gms.measurement.internal.zzgx r8 = r3.zzj()
            java.lang.String r9 = r4.zzh()
            java.lang.String r8 = r8.zzd(r9)
            zzQ(r0, r6, r7, r8)
            boolean r8 = r4.zzu()
            if (r8 == 0) goto L571
            long r8 = r4.zzd()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r9 = "timestamp_millis"
            zzQ(r0, r6, r9, r8)
        L571:
            boolean r8 = r4.zzt()
            if (r8 == 0) goto L584
            long r8 = r4.zzc()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r9 = "previous_timestamp_millis"
            zzQ(r0, r6, r9, r8)
        L584:
            boolean r8 = r4.zzs()
            if (r8 == 0) goto L597
            int r8 = r4.zza()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "count"
            zzQ(r0, r6, r9, r8)
        L597:
            int r8 = r4.zzb()
            if (r8 == 0) goto L5a4
            java.util.List r4 = r4.zzi()
            r13.zzJ(r0, r6, r4)
        L5a4:
            zzL(r0, r6)
            r0.append(r5)
            goto L539
        L5ab:
            zzL(r0, r2)
            r0.append(r5)
            goto L36
        L5b3:
            java.lang.String r14 = "} // End-of-batch\n"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            return r14
    }

    final java.lang.String zzr(com.google.android.gms.internal.measurement.zzfj r6) {
            r5 = this;
            if (r6 != 0) goto L5
            java.lang.String r6 = "null"
            return r6
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\nevent_filter {\n"
            r0.append(r1)
            boolean r1 = r6.zzp()
            r2 = 0
            if (r1 == 0) goto L23
            int r1 = r6.zzb()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "filter_id"
            zzQ(r0, r2, r3, r1)
        L23:
            com.google.android.gms.measurement.internal.zzio r1 = r5.zzu
            com.google.android.gms.measurement.internal.zzgx r1 = r1.zzj()
            java.lang.String r3 = r6.zzg()
            java.lang.String r1 = r1.zzd(r3)
            java.lang.String r3 = "event_name"
            zzQ(r0, r2, r3, r1)
            boolean r1 = r6.zzk()
            boolean r3 = r6.zzm()
            boolean r4 = r6.zzn()
            java.lang.String r1 = zzN(r1, r3, r4)
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L51
            java.lang.String r3 = "filter_type"
            zzQ(r0, r2, r3, r1)
        L51:
            boolean r1 = r6.zzo()
            r2 = 1
            if (r1 == 0) goto L61
            com.google.android.gms.internal.measurement.zzfp r1 = r6.zzf()
            java.lang.String r3 = "event_count_filter"
            zzR(r0, r2, r3, r1)
        L61:
            int r1 = r6.zza()
            if (r1 <= 0) goto L85
            java.lang.String r1 = "  filters {\n"
            r0.append(r1)
            java.util.List r6 = r6.zzh()
            java.util.Iterator r6 = r6.iterator()
        L74:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L85
            r1 = 2
            java.lang.Object r3 = r6.next()
            com.google.android.gms.internal.measurement.zzfl r3 = (com.google.android.gms.internal.measurement.zzfl) r3
            r5.zzK(r0, r1, r3)
            goto L74
        L85:
            zzL(r0, r2)
            java.lang.String r6 = "}\n}\n"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    final java.lang.String zzs(com.google.android.gms.internal.measurement.zzfr r6) {
            r5 = this;
            if (r6 != 0) goto L5
            java.lang.String r6 = "null"
            return r6
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\nproperty_filter {\n"
            r0.append(r1)
            boolean r1 = r6.zzj()
            r2 = 0
            if (r1 == 0) goto L23
            int r1 = r6.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "filter_id"
            zzQ(r0, r2, r3, r1)
        L23:
            com.google.android.gms.measurement.internal.zzio r1 = r5.zzu
            com.google.android.gms.measurement.internal.zzgx r1 = r1.zzj()
            java.lang.String r3 = r6.zze()
            java.lang.String r1 = r1.zzf(r3)
            java.lang.String r3 = "property_name"
            zzQ(r0, r2, r3, r1)
            boolean r1 = r6.zzg()
            boolean r3 = r6.zzh()
            boolean r4 = r6.zzi()
            java.lang.String r1 = zzN(r1, r3, r4)
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L51
            java.lang.String r3 = "filter_type"
            zzQ(r0, r2, r3, r1)
        L51:
            r1 = 1
            com.google.android.gms.internal.measurement.zzfl r6 = r6.zzb()
            r5.zzK(r0, r1, r6)
            java.lang.String r6 = "}\n"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    final java.util.List zzt(java.util.List r8, java.util.List r9) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L9:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L6c
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r1 = r9.intValue()
            if (r1 >= 0) goto L2b
            com.google.android.gms.measurement.internal.zzio r1 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.String r2 = "Ignoring negative bit index to be cleared"
            r1.zzb(r2, r9)
            goto L9
        L2b:
            int r1 = r9.intValue()
            int r1 = r1 / 64
            int r2 = r0.size()
            if (r1 < r2) goto L4f
            com.google.android.gms.measurement.internal.zzio r1 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            int r2 = r0.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Ignoring bit index greater than bitSet size"
            r1.zzc(r3, r9, r2)
            goto L9
        L4f:
            java.lang.Object r2 = r0.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r4 = 1
            int r9 = r9.intValue()
            int r9 = r9 % 64
            long r4 = r4 << r9
            long r4 = ~r4
            long r2 = r2 & r4
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            r0.set(r1, r9)
            goto L9
        L6c:
            int r8 = r0.size()
            int r9 = r0.size()
            int r9 = r9 + (-1)
        L76:
            r6 = r9
            r9 = r8
            r8 = r6
            if (r8 < 0) goto L8f
            java.lang.Object r1 = r0.get(r8)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L8c
            goto L8f
        L8c:
            int r9 = r8 + (-1)
            goto L76
        L8f:
            r8 = 0
            java.util.List r8 = r0.subList(r8, r9)
            return r8
    }

    final java.util.Map zzv(android.os.Bundle r11, boolean r12) {
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = 0
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzv(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = 0
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzv(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.zzv(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
    }

    final void zzw(com.google.android.gms.internal.measurement.zzhp r11, java.lang.Object r12) {
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            r11.zzg()
            r11.zze()
            r11.zzd()
            r11.zzf()
            boolean r0 = r12 instanceof java.lang.String
            if (r0 == 0) goto L19
            java.lang.String r12 = (java.lang.String) r12
            r11.zzk(r12)
            return
        L19:
            boolean r0 = r12 instanceof java.lang.Long
            if (r0 == 0) goto L27
            java.lang.Long r12 = (java.lang.Long) r12
            long r0 = r12.longValue()
            r11.zzi(r0)
            return
        L27:
            boolean r0 = r12 instanceof java.lang.Double
            if (r0 == 0) goto L35
            java.lang.Double r12 = (java.lang.Double) r12
            double r0 = r12.doubleValue()
            r11.zzh(r0)
            return
        L35:
            boolean r0 = r12 instanceof android.os.Bundle[]
            if (r0 == 0) goto Lab
            android.os.Bundle[] r12 = (android.os.Bundle[]) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r12.length
            r2 = 0
        L42:
            if (r2 >= r1) goto La7
            r3 = r12[r2]
            if (r3 != 0) goto L49
            goto La4
        L49:
            com.google.android.gms.internal.measurement.zzhp r4 = com.google.android.gms.internal.measurement.zzhq.zze()
            java.util.Set r5 = r3.keySet()
            java.util.Iterator r5 = r5.iterator()
        L55:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L95
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.gms.internal.measurement.zzhp r7 = com.google.android.gms.internal.measurement.zzhq.zze()
            r7.zzj(r6)
            java.lang.Object r6 = r3.get(r6)
            boolean r8 = r6 instanceof java.lang.Long
            if (r8 == 0) goto L7a
            java.lang.Long r6 = (java.lang.Long) r6
            long r8 = r6.longValue()
            r7.zzi(r8)
            goto L91
        L7a:
            boolean r8 = r6 instanceof java.lang.String
            if (r8 == 0) goto L84
            java.lang.String r6 = (java.lang.String) r6
            r7.zzk(r6)
            goto L91
        L84:
            boolean r8 = r6 instanceof java.lang.Double
            if (r8 == 0) goto L55
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r7.zzh(r8)
        L91:
            r4.zzc(r7)
            goto L55
        L95:
            int r3 = r4.zza()
            if (r3 <= 0) goto La4
            com.google.android.gms.internal.measurement.zzmd r3 = r4.zzba()
            com.google.android.gms.internal.measurement.zzhq r3 = (com.google.android.gms.internal.measurement.zzhq) r3
            r0.add(r3)
        La4:
            int r2 = r2 + 1
            goto L42
        La7:
            r11.zzb(r0)
            return
        Lab:
            com.google.android.gms.measurement.internal.zzio r11 = r10.zzu
            com.google.android.gms.measurement.internal.zzhe r11 = r11.zzaW()
            com.google.android.gms.measurement.internal.zzhc r11 = r11.zze()
            java.lang.String r0 = "Ignoring invalid (type) event param value"
            r11.zzb(r0, r12)
            return
    }

    final void zzx(com.google.android.gms.internal.measurement.zzin r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            r3.zzc()
            r3.zzb()
            r3.zza()
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L16
            java.lang.String r4 = (java.lang.String) r4
            r3.zzh(r4)
            return
        L16:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L24
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            r3.zze(r0)
            return
        L24:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L32
            java.lang.Double r4 = (java.lang.Double) r4
            double r0 = r4.doubleValue()
            r3.zzd(r0)
            return
        L32:
            com.google.android.gms.measurement.internal.zzio r3 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.String r0 = "Ignoring invalid (type) user attribute value"
            r3.zzb(r0, r4)
            return
    }

    final boolean zzz(long r4, long r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L20
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L20
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r0 = r0.currentTimeMillis()
            long r0 = r0 - r4
            long r4 = java.lang.Math.abs(r0)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L1e
            goto L20
        L1e:
            r4 = 0
            return r4
        L20:
            r4 = 1
            return r4
    }
}
