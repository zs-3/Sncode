package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgo implements com.google.android.gms.internal.ads.zzgg {
    private final android.content.Context zza;
    private final java.util.List zzb;
    private final com.google.android.gms.internal.ads.zzgg zzc;
    private com.google.android.gms.internal.ads.zzgg zzd;
    private com.google.android.gms.internal.ads.zzgg zze;
    private com.google.android.gms.internal.ads.zzgg zzf;
    private com.google.android.gms.internal.ads.zzgg zzg;
    private com.google.android.gms.internal.ads.zzgg zzh;
    private com.google.android.gms.internal.ads.zzgg zzi;
    private com.google.android.gms.internal.ads.zzgg zzj;
    private com.google.android.gms.internal.ads.zzgg zzk;

    public zzgo(android.content.Context r1, com.google.android.gms.internal.ads.zzgg r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.zza = r1
            r0.zzc = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zzb = r1
            return
    }

    private final com.google.android.gms.internal.ads.zzgg zzg() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgg r0 = r2.zze
            if (r0 != 0) goto L10
            android.content.Context r0 = r2.zza
            com.google.android.gms.internal.ads.zzfy r1 = new com.google.android.gms.internal.ads.zzfy
            r1.<init>(r0)
            r2.zze = r1
            r2.zzh(r1)
        L10:
            com.google.android.gms.internal.ads.zzgg r0 = r2.zze
            return r0
    }

    private final void zzh(com.google.android.gms.internal.ads.zzgg r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.List r1 = r2.zzb
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List r1 = r2.zzb
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzhh r1 = (com.google.android.gms.internal.ads.zzhh) r1
            r3.zzf(r1)
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    private static final void zzi(com.google.android.gms.internal.ads.zzgg r0, com.google.android.gms.internal.ads.zzhh r1) {
            if (r0 == 0) goto L5
            r0.zzf(r1)
        L5:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzgg r0 = r1.zzk
            java.util.Objects.requireNonNull(r0)
            int r2 = r0.zza(r2, r3, r4)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r5) throws java.io.IOException {
            r4 = this;
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzk
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            android.net.Uri r0 = r5.zza
            java.lang.String r0 = r0.getScheme()
            android.net.Uri r2 = r5.zza
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            java.lang.String r2 = r2.getScheme()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Lfd
            java.lang.String r3 = "file"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L29
            goto Lfd
        L29:
            java.lang.String r2 = "asset"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L39
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzg()
            r4.zzk = r0
            goto L126
        L39:
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L57
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzf
            if (r0 != 0) goto L51
            android.content.Context r0 = r4.zza
            com.google.android.gms.internal.ads.zzgd r1 = new com.google.android.gms.internal.ads.zzgd
            r1.<init>(r0)
            r4.zzf = r1
            r4.zzh(r1)
        L51:
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzf
            r4.zzk = r0
            goto L126
        L57:
            java.lang.String r2 = "rtmp"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L9b
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzg
            if (r0 != 0) goto L95
            java.lang.String r0 = "androidx.media3.datasource.rtmp.RtmpDataSource"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            com.google.android.gms.internal.ads.zzgg r0 = (com.google.android.gms.internal.ads.zzgg) r0     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            r4.zzg = r0     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            r4.zzh(r0)     // Catch: java.lang.Exception -> L7d java.lang.ClassNotFoundException -> L86
            goto L8d
        L7d:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Error instantiating RTMP extension"
            r0.<init>(r1, r5)
            throw r0
        L86:
            java.lang.String r0 = "DefaultDataSource"
            java.lang.String r1 = "Attempting to play RTMP stream without depending on the RTMP extension"
            com.google.android.gms.internal.ads.zzea.zzf(r0, r1)
        L8d:
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzg
            if (r0 != 0) goto L95
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzc
            r4.zzg = r0
        L95:
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzg
            r4.zzk = r0
            goto L126
        L9b:
            java.lang.String r1 = "udp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lb9
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzh
            if (r0 != 0) goto Lb3
            com.google.android.gms.internal.ads.zzhj r0 = new com.google.android.gms.internal.ads.zzhj
            r1 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r1)
            r4.zzh = r0
            r4.zzh(r0)
        Lb3:
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzh
            r4.zzk = r0
            goto L126
        Lb9:
            java.lang.String r1 = "data"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Ld4
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzi
            if (r0 != 0) goto Lcf
            com.google.android.gms.internal.ads.zzge r0 = new com.google.android.gms.internal.ads.zzge
            r0.<init>()
            r4.zzi = r0
            r4.zzh(r0)
        Lcf:
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzi
            r4.zzk = r0
            goto L126
        Ld4:
            java.lang.String r1 = "rawresource"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Le8
            java.lang.String r1 = "android.resource"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le5
            goto Le8
        Le5:
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzc
            goto Lfa
        Le8:
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzj
            if (r0 != 0) goto Lf8
            android.content.Context r0 = r4.zza
            com.google.android.gms.internal.ads.zzhf r1 = new com.google.android.gms.internal.ads.zzhf
            r1.<init>(r0)
            r4.zzj = r1
            r4.zzh(r1)
        Lf8:
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzj
        Lfa:
            r4.zzk = r0
            goto L126
        Lfd:
            android.net.Uri r0 = r5.zza
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L114
            java.lang.String r1 = "/android_asset/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L114
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzg()
            r4.zzk = r0
            goto L126
        L114:
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzd
            if (r0 != 0) goto L122
            com.google.android.gms.internal.ads.zzgw r0 = new com.google.android.gms.internal.ads.zzgw
            r0.<init>()
            r4.zzd = r0
            r4.zzh(r0)
        L122:
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzd
            r4.zzk = r0
        L126:
            com.google.android.gms.internal.ads.zzgg r0 = r4.zzk
            long r0 = r0.zzb(r5)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgg r0 = r1.zzk
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.net.Uri r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.ads.zzgg r0 = r2.zzk
            if (r0 == 0) goto Lf
            r1 = 0
            r0.zzd()     // Catch: java.lang.Throwable -> Lb
            r2.zzk = r1
            return
        Lb:
            r0 = move-exception
            r2.zzk = r1
            throw r0
        Lf:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final java.util.Map zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgg r0 = r1.zzk
            if (r0 != 0) goto L9
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto Ld
        L9:
            java.util.Map r0 = r0.zze()
        Ld:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzf(com.google.android.gms.internal.ads.zzhh r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzgg r0 = r1.zzc
            r0.zzf(r2)
            java.util.List r0 = r1.zzb
            r0.add(r2)
            com.google.android.gms.internal.ads.zzgg r0 = r1.zzd
            zzi(r0, r2)
            com.google.android.gms.internal.ads.zzgg r0 = r1.zze
            zzi(r0, r2)
            com.google.android.gms.internal.ads.zzgg r0 = r1.zzf
            zzi(r0, r2)
            com.google.android.gms.internal.ads.zzgg r0 = r1.zzg
            zzi(r0, r2)
            com.google.android.gms.internal.ads.zzgg r0 = r1.zzh
            zzi(r0, r2)
            com.google.android.gms.internal.ads.zzgg r0 = r1.zzi
            zzi(r0, r2)
            com.google.android.gms.internal.ads.zzgg r0 = r1.zzj
            zzi(r0, r2)
            return
    }
}
