package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhg implements com.google.android.gms.internal.ads.zzgg {
    private final com.google.android.gms.internal.ads.zzgg zza;
    private long zzb;
    private android.net.Uri zzc;
    private java.util.Map zzd;

    public zzhg(com.google.android.gms.internal.ads.zzgg r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            android.net.Uri r1 = android.net.Uri.EMPTY
            r0.zzc = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.zzd = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.ads.zzgg r0 = r2.zza
            int r3 = r0.zza(r3, r4, r5)
            r4 = -1
            if (r3 == r4) goto Lf
            long r4 = r2.zzb
            long r0 = (long) r3
            long r4 = r4 + r0
            r2.zzb = r4
        Lf:
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r3) throws java.io.IOException {
            r2 = this;
            android.net.Uri r0 = r3.zza
            r2.zzc = r0
            java.util.Map r0 = java.util.Collections.emptyMap()
            r2.zzd = r0
            com.google.android.gms.internal.ads.zzgg r0 = r2.zza
            long r0 = r0.zzb(r3)
            android.net.Uri r3 = r2.zzc()
            java.util.Objects.requireNonNull(r3)
            r2.zzc = r3
            java.util.Map r3 = r2.zze()
            r2.zzd = r3
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgg r0 = r1.zza
            android.net.Uri r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzgg r0 = r1.zza
            r0.zzd()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final java.util.Map zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgg r0 = r1.zza
            java.util.Map r0 = r0.zze()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzf(com.google.android.gms.internal.ads.zzhh r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzgg r0 = r1.zza
            r0.zzf(r2)
            return
    }

    public final long zzg() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    public final android.net.Uri zzh() {
            r1 = this;
            android.net.Uri r0 = r1.zzc
            return r0
    }

    public final java.util.Map zzi() {
            r1 = this;
            java.util.Map r0 = r1.zzd
            return r0
    }
}
