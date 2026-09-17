package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhk extends com.google.android.gms.measurement.internal.zzpg {
    public zzhk(com.google.android.gms.measurement.internal.zzpv r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public final void zza(com.google.android.gms.measurement.internal.zzh r11, java.util.Map r12, com.google.android.gms.measurement.internal.zzhg r13) {
            r10 = this;
            r10.zzg()
            r10.zzav()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            com.google.android.gms.measurement.internal.zzpv r0 = r10.zzg
            com.google.android.gms.measurement.internal.zzpi r0 = r0.zzy()
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r2 = r11.zzH()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L25
            java.lang.String r2 = r11.zzA()
        L25:
            com.google.android.gms.measurement.internal.zzgg r3 = com.google.android.gms.measurement.internal.zzgi.zze
            r4 = 0
            java.lang.Object r3 = r3.zza(r4)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r3 = r1.scheme(r3)
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzf
            java.lang.Object r4 = r5.zza(r4)
            java.lang.String r4 = (java.lang.String) r4
            android.net.Uri$Builder r3 = r3.encodedAuthority(r4)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "config/app/"
            java.lang.String r2 = r4.concat(r2)
            android.net.Uri$Builder r2 = r3.path(r2)
            java.lang.String r3 = "platform"
            java.lang.String r4 = "android"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r3, r4)
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            r0.zzj()
            r3 = 119002(0x1d0da, double:5.8795E-319)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "gmp_version"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r3, r0)
            java.lang.String r2 = "runtime_version"
            java.lang.String r3 = "0"
            r0.appendQueryParameter(r2, r3)
            android.net.Uri r0 = r1.build()
            java.lang.String r0 = r0.toString()
            java.net.URI r1 = new java.net.URI     // Catch: java.lang.Throwable -> L9a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9a
            java.net.URL r5 = r1.toURL()     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.measurement.internal.zzio r1 = r10.zzu     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.measurement.internal.zzil r1 = r1.zzaX()     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.measurement.internal.zzhi r9 = new com.google.android.gms.measurement.internal.zzhi     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = r11.zzC()     // Catch: java.lang.Throwable -> L9a
            r6 = 0
            r2 = r9
            r3 = r10
            r7 = r12
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9a
            r1.zzp(r9)     // Catch: java.lang.Throwable -> L9a
            return
        L9a:
            com.google.android.gms.measurement.internal.zzio r12 = r10.zzu
            com.google.android.gms.measurement.internal.zzhe r12 = r12.zzaW()
            com.google.android.gms.measurement.internal.zzhc r12 = r12.zze()
            java.lang.String r11 = r11.zzC()
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzhe.zzn(r11)
            java.lang.String r13 = "Failed to parse config URL. Not fetching. appId"
            r12.zzc(r13, r11, r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void zzc(java.lang.String r10, com.google.android.gms.measurement.internal.zzph r11, com.google.android.gms.internal.measurement.zzhv r12, com.google.android.gms.measurement.internal.zzhg r13) {
            r9 = this;
            r9.zzg()
            r9.zzav()
            java.net.URI r0 = new java.net.URI     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r11.zzc()     // Catch: java.lang.Throwable -> L33
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L33
            java.net.URL r5 = r0.toURL()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.measurement.internal.zzpv r0 = r9.zzg     // Catch: java.lang.Throwable -> L33
            r0.zzA()     // Catch: java.lang.Throwable -> L33
            byte[] r6 = r12.zzcd()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.measurement.internal.zzio r12 = r9.zzu     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.measurement.internal.zzil r12 = r12.zzaX()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.measurement.internal.zzhi r0 = new com.google.android.gms.measurement.internal.zzhi     // Catch: java.lang.Throwable -> L33
            java.util.Map r7 = r11.zzd()     // Catch: java.lang.Throwable -> L33
            r2 = r0
            r3 = r9
            r4 = r10
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L33
            r12.zzp(r0)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            com.google.android.gms.measurement.internal.zzio r12 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r12 = r12.zzaW()
            com.google.android.gms.measurement.internal.zzhc r12 = r12.zze()
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzhe.zzn(r10)
            java.lang.String r11 = r11.zzc()
            java.lang.String r13 = "Failed to parse URL. Not uploading MeasurementBatch. appId"
            r12.zzc(r13, r10, r11)
            return
    }

    public final boolean zzd() {
            r2 = this;
            r2.zzav()
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            android.content.Context r0 = r0.zzaT()
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r1 = 0
            if (r0 == 0) goto L1a
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L19
            goto L1a
        L19:
        L1a:
            if (r1 == 0) goto L24
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L24
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
    }
}
