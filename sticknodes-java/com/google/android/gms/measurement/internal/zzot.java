package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzot {
    static final com.google.common.collect.ImmutableList zza = null;
    public static final /* synthetic */ int zzb = 0;

    static {
            java.lang.String r0 = "Purpose7"
            java.lang.String r1 = "CmpSdkID"
            java.lang.String r2 = "PublisherCC"
            java.lang.String r3 = "PublisherRestrictions1"
            java.lang.String r4 = "PublisherRestrictions3"
            java.lang.String r5 = "PublisherRestrictions4"
            java.lang.String r6 = "PublisherRestrictions7"
            java.lang.String r7 = "AuthorizePurpose1"
            java.lang.String r8 = "AuthorizePurpose3"
            java.lang.String r9 = "AuthorizePurpose4"
            java.lang.String r10 = "AuthorizePurpose7"
            java.lang.String r11 = "PurposeDiagnostics"
            java.lang.String[] r24 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.lang.String r12 = "Version"
            java.lang.String r13 = "GoogleConsent"
            java.lang.String r14 = "VendorConsent"
            java.lang.String r15 = "VendorLegitimateInterest"
            java.lang.String r16 = "gdprApplies"
            java.lang.String r17 = "EnableAdvertiserConsentMode"
            java.lang.String r18 = "PolicyVersion"
            java.lang.String r19 = "PurposeConsents"
            java.lang.String r20 = "PurposeOneTreatment"
            java.lang.String r21 = "Purpose1"
            java.lang.String r22 = "Purpose3"
            java.lang.String r23 = "Purpose4"
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.google.android.gms.measurement.internal.zzot.zza = r0
            return
    }

    static int zza(android.content.SharedPreferences r1, java.lang.String r2) {
            r0 = -1
            int r1 = r1.getInt(r2, r0)     // Catch: java.lang.ClassCastException -> L6
            return r1
        L6:
            return r0
    }

    static java.lang.String zzb(android.content.SharedPreferences r1, java.lang.String r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = r1.getString(r2, r0)     // Catch: java.lang.ClassCastException -> L7
            return r1
        L7:
            return r0
    }

    public static final java.util.Map zzc(com.google.common.collect.ImmutableMap r31, com.google.common.collect.ImmutableMap r32, com.google.common.collect.ImmutableSet r33, char[] r34, int r35, int r36, int r37, int r38, int r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, boolean r43, boolean r44) {
            r15 = r32
            com.google.android.gms.internal.measurement.zzkl r14 = com.google.android.gms.internal.measurement.zzkl.zzb
            java.lang.Object r0 = r15.get(r14)
            com.google.android.gms.internal.measurement.zzkm r0 = (com.google.android.gms.internal.measurement.zzkm) r0
            com.google.android.gms.internal.measurement.zzkl r13 = com.google.android.gms.internal.measurement.zzkl.zzd
            java.lang.Object r1 = r15.get(r13)
            com.google.android.gms.internal.measurement.zzkm r1 = (com.google.android.gms.internal.measurement.zzkm) r1
            com.google.android.gms.internal.measurement.zzkl r12 = com.google.android.gms.internal.measurement.zzkl.zze
            java.lang.Object r2 = r15.get(r12)
            com.google.android.gms.internal.measurement.zzkm r2 = (com.google.android.gms.internal.measurement.zzkm) r2
            com.google.android.gms.internal.measurement.zzkl r11 = com.google.android.gms.internal.measurement.zzkl.zzh
            java.lang.Object r3 = r15.get(r11)
            com.google.android.gms.internal.measurement.zzkm r3 = (com.google.android.gms.internal.measurement.zzkm) r3
            com.google.common.collect.ImmutableMap$Builder r4 = com.google.common.collect.ImmutableMap.builder()
            java.lang.String r5 = "Version"
            java.lang.String r6 = "2"
            com.google.common.collect.ImmutableMap$Builder r4 = r4.put(r5, r6)
            java.lang.String r16 = "0"
            java.lang.String r17 = "1"
            r10 = 1
            r9 = r43
            if (r10 == r9) goto L3a
            r5 = r16
            goto L3c
        L3a:
            r5 = r17
        L3c:
            java.lang.String r6 = "VendorConsent"
            com.google.common.collect.ImmutableMap$Builder r4 = r4.put(r6, r5)
            r8 = r44
            if (r10 == r8) goto L49
            r5 = r16
            goto L4b
        L49:
            r5 = r17
        L4b:
            java.lang.String r6 = "VendorLegitimateInterest"
            com.google.common.collect.ImmutableMap$Builder r4 = r4.put(r6, r5)
            r7 = r37
            if (r7 == r10) goto L58
            r5 = r16
            goto L5a
        L58:
            r5 = r17
        L5a:
            java.lang.String r6 = "gdprApplies"
            com.google.common.collect.ImmutableMap$Builder r4 = r4.put(r6, r5)
            r6 = r36
            if (r6 == r10) goto L67
            r5 = r16
            goto L69
        L67:
            r5 = r17
        L69:
            java.lang.String r10 = "EnableAdvertiserConsentMode"
            com.google.common.collect.ImmutableMap$Builder r4 = r4.put(r10, r5)
            java.lang.String r5 = java.lang.String.valueOf(r38)
            java.lang.String r10 = "PolicyVersion"
            com.google.common.collect.ImmutableMap$Builder r4 = r4.put(r10, r5)
            java.lang.String r5 = java.lang.String.valueOf(r35)
            java.lang.String r10 = "CmpSdkID"
            com.google.common.collect.ImmutableMap$Builder r4 = r4.put(r10, r5)
            r10 = r39
            r5 = 1
            if (r10 == r5) goto L8b
            r5 = r16
            goto L8d
        L8b:
            r5 = r17
        L8d:
            java.lang.String r6 = "PurposeOneTreatment"
            com.google.common.collect.ImmutableMap$Builder r4 = r4.put(r6, r5)
            java.lang.String r5 = "PublisherCC"
            r6 = r40
            com.google.common.collect.ImmutableMap$Builder r4 = r4.put(r5, r6)
            if (r0 == 0) goto La2
            int r0 = r0.zza()
            goto La8
        La2:
            com.google.android.gms.internal.measurement.zzkm r0 = com.google.android.gms.internal.measurement.zzkm.zzd
            int r0 = r0.zza()
        La8:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "PublisherRestrictions1"
            com.google.common.collect.ImmutableMap$Builder r0 = r4.put(r5, r0)
            if (r1 == 0) goto Lb9
            int r1 = r1.zza()
            goto Lbf
        Lb9:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzd
            int r1 = r1.zza()
        Lbf:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "PublisherRestrictions3"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r4, r1)
            if (r2 == 0) goto Ld0
            int r1 = r2.zza()
            goto Ld6
        Ld0:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzd
            int r1 = r1.zza()
        Ld6:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "PublisherRestrictions4"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            if (r3 == 0) goto Le7
            int r1 = r3.zza()
            goto Led
        Le7:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzd
            int r1 = r1.zza()
        Led:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "PublisherRestrictions7"
            com.google.common.collect.ImmutableMap$Builder r5 = r0.put(r2, r1)
            r0 = r14
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r15 = r5
            r18 = 1
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r18 = r11
            r11 = r41
            r20 = r12
            r12 = r42
            r21 = r13
            r13 = r43
            r22 = r14
            r14 = r44
            java.lang.String r24 = zzg(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r21
            java.lang.String r26 = zzg(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r20
            java.lang.String r28 = zzg(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r18
            java.lang.String r30 = zzg(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r23 = "Purpose1"
            java.lang.String r25 = "Purpose3"
            java.lang.String r27 = "Purpose4"
            java.lang.String r29 = "Purpose7"
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of(r23, r24, r25, r26, r27, r28, r29, r30)
            com.google.common.collect.ImmutableMap$Builder r15 = r15.putAll(r0)
            r0 = r22
            boolean r0 = zzd(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r14 = 1
            if (r14 == r0) goto L151
            r19 = r16
            goto L153
        L151:
            r19 = r17
        L153:
            r0 = r21
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r41
            r12 = r42
            r13 = r43
            r21 = r15
            r15 = 1
            r14 = r44
            boolean r0 = zzd(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r15 == r0) goto L17d
            r22 = r16
            goto L17f
        L17d:
            r22 = r17
        L17f:
            r0 = r20
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r41
            r12 = r42
            r13 = r43
            r14 = r44
            boolean r0 = zzd(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r15 == r0) goto L1a6
            r20 = r16
            goto L1a8
        L1a6:
            r20 = r17
        L1a8:
            r0 = r18
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r41
            r12 = r42
            r13 = r43
            r14 = r44
            boolean r0 = zzd(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r15 == r0) goto L1cd
            goto L1cf
        L1cd:
            r16 = r17
        L1cf:
            java.lang.String r0 = new java.lang.String
            r1 = r34
            r0.<init>(r1)
            java.lang.String r1 = "AuthorizePurpose1"
            java.lang.String r2 = "AuthorizePurpose3"
            java.lang.String r3 = "AuthorizePurpose4"
            java.lang.String r4 = "AuthorizePurpose7"
            java.lang.String r5 = "PurposeDiagnostics"
            r31 = r1
            r32 = r19
            r33 = r2
            r34 = r22
            r35 = r3
            r36 = r20
            r37 = r4
            r38 = r16
            r39 = r5
            r40 = r0
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r1 = r21
            com.google.common.collect.ImmutableMap$Builder r0 = r1.putAll(r0)
            com.google.common.collect.ImmutableMap r0 = r0.buildOrThrow()
            return r0
    }

    static final boolean zzd(com.google.android.gms.internal.measurement.zzkl r21, com.google.common.collect.ImmutableMap r22, com.google.common.collect.ImmutableMap r23, com.google.common.collect.ImmutableSet r24, char[] r25, int r26, int r27, int r28, int r29, int r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, boolean r34, boolean r35) {
            r15 = r21
            r14 = r22
            int r16 = zze(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r13 = 50
            r12 = 1
            if (r16 <= 0) goto L1f
            r0 = r28
            r1 = r27
            if (r0 != r12) goto L1c
            if (r1 == r12) goto L17
            r0 = 1
            goto L1c
        L17:
            r17 = 1
            r18 = 1
            goto L27
        L1c:
            r25[r16] = r13
            goto L23
        L1f:
            r1 = r27
            r0 = r28
        L23:
            r18 = r0
            r17 = r1
        L27:
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r17
            r7 = r18
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            com.google.android.gms.internal.measurement.zzkm r0 = zzf(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zza
            r20 = 56
            r2 = 48
            if (r0 != r1) goto L57
            r20 = 51
            r15 = 50
            goto L1fd
        L57:
            com.google.android.gms.internal.measurement.zzkl r0 = com.google.android.gms.internal.measurement.zzkl.zzb
            if (r15 != r0) goto L7e
            r0 = r30
            r1 = 1
            r14 = r24
            r13 = r31
            if (r0 != r1) goto L85
            boolean r0 = r14.contains(r13)
            if (r0 == 0) goto L77
            if (r16 <= 0) goto L76
            char r0 = r25[r16]
            r12 = 50
            if (r0 == r12) goto L76
            r0 = 49
            r25[r16] = r0
        L76:
            return r1
        L77:
            r12 = 50
            r11 = r22
            r19 = 1
            goto L8b
        L7e:
            r14 = r24
            r0 = r30
            r13 = r31
            r1 = 1
        L85:
            r12 = 50
            r11 = r22
            r19 = r0
        L8b:
            boolean r0 = r11.containsKey(r15)
            if (r0 != 0) goto L97
        L91:
            r15 = 50
            r20 = 48
            goto L1fd
        L97:
            java.lang.Object r0 = r11.get(r15)
            com.google.android.gms.measurement.internal.zzos r0 = (com.google.android.gms.measurement.internal.zzos) r0
            if (r0 != 0) goto La0
            goto L91
        La0:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L1d5
            if (r0 == r1) goto L187
            r1 = 2
            if (r0 == r1) goto L11b
            r1 = 3
            if (r0 == r1) goto Laf
            goto L91
        Laf:
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r17
            r7 = r18
            r8 = r29
            r9 = r19
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            com.google.android.gms.internal.measurement.zzkm r0 = zzf(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzb
            if (r0 != r1) goto Lf8
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r17
            r7 = r18
            r8 = r29
            r9 = r19
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            boolean r0 = zzh(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        Lf8:
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r17
            r7 = r18
            r8 = r29
            r9 = r19
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            boolean r0 = zzi(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L11b:
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r17
            r7 = r18
            r8 = r29
            r9 = r19
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            com.google.android.gms.internal.measurement.zzkm r0 = zzf(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzc
            if (r0 != r1) goto L164
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r17
            r7 = r18
            r8 = r29
            r9 = r19
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            boolean r0 = zzi(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L164:
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r17
            r7 = r18
            r8 = r29
            r9 = r19
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            boolean r0 = zzh(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L187:
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r17
            r7 = r18
            r8 = r29
            r9 = r19
            r10 = r31
            r11 = r32
            r14 = 50
            r12 = r33
            r13 = r34
            r15 = 50
            r14 = r35
            com.google.android.gms.internal.measurement.zzkm r0 = zzf(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzb
            if (r0 != r1) goto L1b2
            goto L1fd
        L1b2:
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r17
            r7 = r18
            r8 = r29
            r9 = r19
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            boolean r0 = zzi(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L1d5:
            r15 = 50
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r17
            r7 = r18
            r8 = r29
            r9 = r19
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            com.google.android.gms.internal.measurement.zzkm r0 = zzf(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzc
            if (r0 != r1) goto L207
        L1fd:
            if (r16 <= 0) goto L205
            char r0 = r25[r16]
            if (r0 == r15) goto L205
            r25[r16] = r20
        L205:
            r0 = 0
            return r0
        L207:
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r17
            r7 = r18
            r8 = r29
            r9 = r19
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            boolean r0 = zzh(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzkl r0, com.google.common.collect.ImmutableMap r1, com.google.common.collect.ImmutableMap r2, com.google.common.collect.ImmutableSet r3, char[] r4, int r5, int r6, int r7, int r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
            com.google.android.gms.internal.measurement.zzkl r1 = com.google.android.gms.internal.measurement.zzkl.zzb
            if (r0 != r1) goto L6
            r0 = 1
            return r0
        L6:
            com.google.android.gms.internal.measurement.zzkl r1 = com.google.android.gms.internal.measurement.zzkl.zzd
            if (r0 != r1) goto Lc
            r0 = 2
            return r0
        Lc:
            com.google.android.gms.internal.measurement.zzkl r1 = com.google.android.gms.internal.measurement.zzkl.zze
            if (r0 != r1) goto L12
            r0 = 3
            return r0
        L12:
            com.google.android.gms.internal.measurement.zzkl r1 = com.google.android.gms.internal.measurement.zzkl.zzh
            if (r0 != r1) goto L18
            r0 = 4
            return r0
        L18:
            r0 = -1
            return r0
    }

    private static final com.google.android.gms.internal.measurement.zzkm zzf(com.google.android.gms.internal.measurement.zzkl r0, com.google.common.collect.ImmutableMap r1, com.google.common.collect.ImmutableMap r2, com.google.common.collect.ImmutableSet r3, char[] r4, int r5, int r6, int r7, int r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzd
            java.lang.Object r0 = r2.getOrDefault(r0, r1)
            com.google.android.gms.internal.measurement.zzkm r0 = (com.google.android.gms.internal.measurement.zzkm) r0
            return r0
    }

    private static final java.lang.String zzg(com.google.android.gms.internal.measurement.zzkl r0, com.google.common.collect.ImmutableMap r1, com.google.common.collect.ImmutableMap r2, com.google.common.collect.ImmutableSet r3, char[] r4, int r5, int r6, int r7, int r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            java.lang.String r2 = "0"
            if (r1 != 0) goto L21
            int r1 = r11.length()
            int r3 = r0.zza()
            if (r1 < r3) goto L21
            int r1 = r0.zza()
            int r1 = r1 + (-1)
            char r1 = r11.charAt(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L22
        L21:
            r1 = r2
        L22:
            boolean r3 = android.text.TextUtils.isEmpty(r12)
            if (r3 != 0) goto L40
            int r3 = r12.length()
            int r4 = r0.zza()
            if (r3 < r4) goto L40
            int r0 = r0.zza()
            int r0 = r0 + (-1)
            char r0 = r12.charAt(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
        L40:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.concat(r1)
            return r0
    }

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzkl r0, com.google.common.collect.ImmutableMap r1, com.google.common.collect.ImmutableMap r2, com.google.common.collect.ImmutableSet r3, char[] r4, int r5, int r6, int r7, int r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
            int r1 = zze(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = 50
            r3 = 0
            if (r13 != 0) goto Lc
            r0 = 52
            goto L18
        Lc:
            int r5 = r11.length()
            int r6 = r0.zza()
            if (r5 >= r6) goto L21
            r0 = 48
        L18:
            if (r1 <= 0) goto L20
            char r5 = r4[r1]
            if (r5 == r2) goto L20
            r4[r1] = r0
        L20:
            return r3
        L21:
            int r0 = r0.zza()
            int r0 = r0 + (-1)
            char r0 = r11.charAt(r0)
            r5 = 49
            if (r0 != r5) goto L30
            r3 = 1
        L30:
            if (r1 <= 0) goto L3d
            char r6 = r4[r1]
            if (r6 == r2) goto L3d
            if (r0 != r5) goto L39
            goto L3b
        L39:
            r5 = 54
        L3b:
            r4[r1] = r5
        L3d:
            return r3
    }

    private static final boolean zzi(com.google.android.gms.internal.measurement.zzkl r0, com.google.common.collect.ImmutableMap r1, com.google.common.collect.ImmutableMap r2, com.google.common.collect.ImmutableSet r3, char[] r4, int r5, int r6, int r7, int r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
            int r1 = zze(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = 50
            r3 = 0
            if (r14 != 0) goto Lc
            r0 = 53
            goto L18
        Lc:
            int r5 = r12.length()
            int r6 = r0.zza()
            if (r5 >= r6) goto L21
            r0 = 48
        L18:
            if (r1 <= 0) goto L20
            char r5 = r4[r1]
            if (r5 == r2) goto L20
            r4[r1] = r0
        L20:
            return r3
        L21:
            int r0 = r0.zza()
            int r0 = r0 + (-1)
            char r0 = r12.charAt(r0)
            r5 = 49
            if (r0 != r5) goto L30
            r3 = 1
        L30:
            if (r1 <= 0) goto L3d
            char r6 = r4[r1]
            if (r6 == r2) goto L3d
            if (r0 != r5) goto L39
            goto L3b
        L39:
            r5 = 55
        L3b:
            r4[r1] = r5
        L3d:
            return r3
    }
}
