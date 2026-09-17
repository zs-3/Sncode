package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzpi extends com.google.android.gms.measurement.internal.zzoz {
    zzpi(com.google.android.gms.measurement.internal.zzpv r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private final java.lang.String zzf(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzpv r0 = r3.zzg
            com.google.android.gms.measurement.internal.zzif r0 = r0.zzr()
            java.lang.String r4 = r0.zzm(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L45
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzq
            java.lang.Object r0 = r0.zza(r1)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = r0.getAuthority()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "."
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.authority(r4)
            android.net.Uri r4 = r1.build()
            java.lang.String r4 = r4.toString()
            return r4
        L45:
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzq
            java.lang.Object r4 = r4.zza(r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
    }

    private final boolean zzh(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzpv r0 = r6.zzg
            com.google.android.gms.measurement.internal.zzif r1 = r0.zzr()
            com.google.android.gms.internal.measurement.zzgo r1 = r1.zzj(r7)
            r2 = 0
            if (r1 != 0) goto Le
            return r2
        Le:
            com.google.android.gms.measurement.internal.zzaw r0 = r0.zzj()
            com.google.android.gms.measurement.internal.zzh r0 = r0.zzl(r7)
            if (r0 != 0) goto L19
            return r2
        L19:
            boolean r3 = r1.zzv()
            r4 = 1
            r5 = 100
            if (r3 == 0) goto L2c
            com.google.android.gms.internal.measurement.zzgy r3 = r1.zzi()
            int r3 = r3.zza()
            if (r3 == r5) goto L3c
        L2c:
            com.google.android.gms.measurement.internal.zzio r3 = r6.zzu
            com.google.android.gms.measurement.internal.zzqf r3 = r3.zzw()
            java.lang.String r0 = r0.zzM()
            boolean r7 = r3.zzak(r7, r0)
            if (r7 == 0) goto L3d
        L3c:
            return r4
        L3d:
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 != 0) goto L58
            int r7 = r8.hashCode()
            int r7 = r7 % r5
            int r7 = java.lang.Math.abs(r7)
            com.google.android.gms.internal.measurement.zzgy r8 = r1.zzi()
            int r8 = r8.zza()
            if (r7 < r8) goto L57
            goto L58
        L57:
            return r4
        L58:
            return r2
    }

    private static final boolean zzi(java.lang.String r5) {
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzs
            r1 = 0
            java.lang.Object r0 = r0.zza(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L11
            return r2
        L11:
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 0
        L19:
            if (r3 >= r1) goto L2c
            r4 = r0[r3]
            java.lang.String r4 = r4.trim()
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L29
            r5 = 1
            return r5
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            return r2
    }

    public final com.google.android.gms.measurement.internal.zzph zza(java.lang.String r14) {
            r13 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r13.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaP
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            java.lang.String r4 = "x-gtm-server-preview"
            if (r1 == 0) goto L188
            com.google.android.gms.measurement.internal.zzpv r1 = r13.zzg
            com.google.android.gms.measurement.internal.zzaw r5 = r1.zzj()
            com.google.android.gms.measurement.internal.zzh r5 = r5.zzl(r14)
            if (r5 == 0) goto L178
            boolean r6 = r5.zzaL()
            if (r6 != 0) goto L25
            goto L178
        L25:
            com.google.android.gms.internal.measurement.zzif r6 = com.google.android.gms.internal.measurement.zzim.zza()
            r7 = 2
            r6.zzc(r7)
            int r8 = r5.zzb()
            com.google.android.gms.internal.measurement.zzih r8 = com.google.android.gms.internal.measurement.zzih.zzb(r8)
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            com.google.android.gms.internal.measurement.zzih r8 = (com.google.android.gms.internal.measurement.zzih) r8
            r6.zza(r8)
            java.lang.String r8 = r5.zzD()
            boolean r8 = r13.zzh(r14, r8)
            r9 = 3
            if (r8 != 0) goto L63
            r6.zzb(r9)
            com.google.android.gms.measurement.internal.zzph r0 = new com.google.android.gms.measurement.internal.zzph
            java.lang.String r14 = r13.zzf(r14)
            java.util.Map r1 = java.util.Collections.emptyMap()
            com.google.android.gms.measurement.internal.zzmf r2 = com.google.android.gms.measurement.internal.zzmf.zza
            com.google.android.gms.internal.measurement.zzmd r3 = r6.zzba()
            com.google.android.gms.internal.measurement.zzim r3 = (com.google.android.gms.internal.measurement.zzim) r3
            r0.<init>(r14, r1, r2, r3)
            goto L187
        L63:
            java.lang.String r8 = r5.zzC()
            r6.zzc(r7)
            com.google.android.gms.measurement.internal.zzif r1 = r1.zzr()
            java.lang.String r10 = r5.zzC()
            com.google.android.gms.internal.measurement.zzgo r1 = r1.zzj(r10)
            if (r1 == 0) goto L14d
            boolean r10 = r1.zzv()
            if (r10 != 0) goto L80
            goto L14d
        L80:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.String r11 = r5.zzM()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L96
            java.lang.String r11 = r5.zzM()
            r10.put(r4, r11)
        L96:
            com.google.android.gms.internal.measurement.zzgy r4 = r1.zzi()
            java.lang.String r4 = r4.zze()
            int r11 = r5.zzb()
            com.google.android.gms.internal.measurement.zzih r11 = com.google.android.gms.internal.measurement.zzih.zzb(r11)
            if (r11 == 0) goto Lb0
            com.google.android.gms.internal.measurement.zzih r12 = com.google.android.gms.internal.measurement.zzih.zzb
            if (r11 == r12) goto Lb0
            r6.zza(r11)
            goto Ldb
        Lb0:
            com.google.android.gms.measurement.internal.zzam r11 = r0.zzf()
            boolean r2 = r11.zzx(r3, r2)
            if (r2 != 0) goto Lc0
            com.google.android.gms.internal.measurement.zzih r2 = com.google.android.gms.internal.measurement.zzih.zzj
            r6.zza(r2)
            goto Ldb
        Lc0:
            java.lang.String r2 = r5.zzC()
            boolean r2 = zzi(r2)
            if (r2 == 0) goto Ld0
            com.google.android.gms.internal.measurement.zzih r2 = com.google.android.gms.internal.measurement.zzih.zzk
            r6.zza(r2)
            goto Ldb
        Ld0:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L12a
            com.google.android.gms.internal.measurement.zzih r2 = com.google.android.gms.internal.measurement.zzih.zzl
            r6.zza(r2)
        Ldb:
            com.google.android.gms.internal.measurement.zzgy r2 = r1.zzi()
            r2.zzf()
            com.google.android.gms.internal.measurement.zzgy r1 = r1.zzi()
            r1.zzd()
            r0.zzaV()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L114
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = "[sgtm] Eligible for local service direct upload. appId"
            r0.zzb(r1, r8)
            r0 = 5
            r6.zzc(r0)
            r6.zzb(r7)
            com.google.android.gms.measurement.internal.zzph r3 = new com.google.android.gms.measurement.internal.zzph
            com.google.android.gms.measurement.internal.zzmf r0 = com.google.android.gms.measurement.internal.zzmf.zzc
            com.google.android.gms.internal.measurement.zzmd r1 = r6.zzba()
            com.google.android.gms.internal.measurement.zzim r1 = (com.google.android.gms.internal.measurement.zzim) r1
            r3.<init>(r4, r10, r0, r1)
            goto L15e
        L114:
            r1 = 6
            r6.zzb(r1)
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = r5.zzC()
            java.lang.String r2 = "[sgtm] Local service, missing sgtm_server_url"
            r0.zzb(r2, r1)
            goto L15e
        L12a:
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = "[sgtm] Eligible for client side upload. appId"
            r0.zzb(r1, r8)
            r6.zzc(r9)
            com.google.android.gms.internal.measurement.zzih r0 = com.google.android.gms.internal.measurement.zzih.zzb
            r6.zza(r0)
            com.google.android.gms.measurement.internal.zzph r3 = new com.google.android.gms.measurement.internal.zzph
            com.google.android.gms.measurement.internal.zzmf r0 = com.google.android.gms.measurement.internal.zzmf.zzd
            com.google.android.gms.internal.measurement.zzmd r1 = r6.zzba()
            com.google.android.gms.internal.measurement.zzim r1 = (com.google.android.gms.internal.measurement.zzim) r1
            r3.<init>(r4, r10, r0, r1)
            goto L15e
        L14d:
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = "[sgtm] Missing sgtm_setting in remote config. appId"
            r0.zzb(r1, r8)
            r0 = 4
            r6.zzb(r0)
        L15e:
            if (r3 == 0) goto L162
            r0 = r3
            goto L187
        L162:
            com.google.android.gms.measurement.internal.zzph r0 = new com.google.android.gms.measurement.internal.zzph
            java.lang.String r14 = r13.zzf(r14)
            java.util.Map r1 = java.util.Collections.emptyMap()
            com.google.android.gms.measurement.internal.zzmf r2 = com.google.android.gms.measurement.internal.zzmf.zza
            com.google.android.gms.internal.measurement.zzmd r3 = r6.zzba()
            com.google.android.gms.internal.measurement.zzim r3 = (com.google.android.gms.internal.measurement.zzim) r3
            r0.<init>(r14, r1, r2, r3)
            return r0
        L178:
            com.google.android.gms.measurement.internal.zzph r0 = new com.google.android.gms.measurement.internal.zzph
            java.lang.String r14 = r13.zzf(r14)
            com.google.android.gms.measurement.internal.zzmf r1 = com.google.android.gms.measurement.internal.zzmf.zza
            java.util.Map r2 = java.util.Collections.emptyMap()
            r0.<init>(r14, r2, r1, r3)
        L187:
            return r0
        L188:
            com.google.android.gms.measurement.internal.zzpv r1 = r13.zzg
            com.google.android.gms.measurement.internal.zzaw r2 = r1.zzj()
            com.google.android.gms.measurement.internal.zzh r2 = r2.zzl(r14)
            if (r2 != 0) goto L1a4
            com.google.android.gms.measurement.internal.zzph r0 = new com.google.android.gms.measurement.internal.zzph
            java.lang.String r14 = r13.zzf(r14)
            com.google.android.gms.measurement.internal.zzmf r1 = com.google.android.gms.measurement.internal.zzmf.zza
            java.util.Map r2 = java.util.Collections.emptyMap()
            r0.<init>(r14, r2, r1, r3)
            return r0
        L1a4:
            java.lang.String r5 = r2.zzD()
            boolean r5 = r13.zzh(r14, r5)
            if (r5 == 0) goto L254
            boolean r5 = r2.zzaL()
            if (r5 != 0) goto L1b7
        L1b4:
            r0 = r3
            goto L241
        L1b7:
            com.google.android.gms.measurement.internal.zzhe r5 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzj()
            java.lang.String r6 = "sgtm upload enabled in manifest."
            r5.zza(r6)
            com.google.android.gms.measurement.internal.zzif r1 = r1.zzr()
            java.lang.String r5 = r2.zzC()
            com.google.android.gms.internal.measurement.zzgo r1 = r1.zzj(r5)
            if (r1 == 0) goto L1b4
            boolean r5 = r1.zzv()
            if (r5 != 0) goto L1d9
            goto L1b4
        L1d9:
            com.google.android.gms.internal.measurement.zzgy r5 = r1.zzi()
            java.lang.String r5 = r5.zzf()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L1e8
            goto L1b4
        L1e8:
            com.google.android.gms.internal.measurement.zzgy r1 = r1.zzi()
            java.lang.String r1 = r1.zzd()
            com.google.android.gms.measurement.internal.zzhe r6 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzj()
            r7 = 1
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r7 == r8) goto L202
            java.lang.String r7 = "N"
            goto L204
        L202:
            java.lang.String r7 = "Y"
        L204:
            java.lang.String r8 = "sgtm configured with upload_url, server_info"
            r6.zzc(r8, r5, r7)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L21e
            r0.zzaV()
            com.google.android.gms.measurement.internal.zzph r0 = new com.google.android.gms.measurement.internal.zzph
            com.google.android.gms.measurement.internal.zzmf r1 = com.google.android.gms.measurement.internal.zzmf.zzc
            java.util.Map r2 = java.util.Collections.emptyMap()
            r0.<init>(r5, r2, r1, r3)
            goto L241
        L21e:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r6 = "x-sgtm-server-info"
            r0.put(r6, r1)
            java.lang.String r1 = r2.zzM()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L239
            java.lang.String r1 = r2.zzM()
            r0.put(r4, r1)
        L239:
            com.google.android.gms.measurement.internal.zzph r1 = new com.google.android.gms.measurement.internal.zzph
            com.google.android.gms.measurement.internal.zzmf r2 = com.google.android.gms.measurement.internal.zzmf.zzc
            r1.<init>(r5, r0, r2, r3)
            r0 = r1
        L241:
            if (r0 == 0) goto L244
            return r0
        L244:
            com.google.android.gms.measurement.internal.zzph r0 = new com.google.android.gms.measurement.internal.zzph
            java.lang.String r14 = r13.zzf(r14)
            com.google.android.gms.measurement.internal.zzmf r1 = com.google.android.gms.measurement.internal.zzmf.zza
            java.util.Map r2 = java.util.Collections.emptyMap()
            r0.<init>(r14, r2, r1, r3)
            return r0
        L254:
            com.google.android.gms.measurement.internal.zzph r0 = new com.google.android.gms.measurement.internal.zzph
            java.lang.String r14 = r13.zzf(r14)
            com.google.android.gms.measurement.internal.zzmf r1 = com.google.android.gms.measurement.internal.zzmf.zza
            java.util.Map r2 = java.util.Collections.emptyMap()
            r0.<init>(r14, r2, r1, r3)
            return r0
    }

    final boolean zzd(java.lang.String r4, com.google.android.gms.internal.measurement.zzih r5) {
            r3 = this;
            r3.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzaP
            r2 = 0
            boolean r0 = r0.zzx(r2, r1)
            r1 = 0
            if (r0 == 0) goto L40
            com.google.android.gms.internal.measurement.zzih r0 = com.google.android.gms.internal.measurement.zzih.zzb
            if (r5 != r0) goto L40
            boolean r5 = zzi(r4)
            if (r5 == 0) goto L1e
            goto L40
        L1e:
            com.google.android.gms.measurement.internal.zzpv r5 = r3.zzg
            com.google.android.gms.measurement.internal.zzif r5 = r5.zzr()
            com.google.android.gms.internal.measurement.zzgo r4 = r5.zzj(r4)
            if (r4 == 0) goto L40
            boolean r5 = r4.zzv()
            if (r5 == 0) goto L40
            com.google.android.gms.internal.measurement.zzgy r4 = r4.zzi()
            java.lang.String r4 = r4.zze()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L40
            r4 = 1
            return r4
        L40:
            return r1
    }
}
