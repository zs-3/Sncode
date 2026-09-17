package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzpb {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public zzpb() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ boolean zze(com.google.android.gms.internal.ads.zzpb r0) {
            boolean r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzf(com.google.android.gms.internal.ads.zzpb r0) {
            boolean r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzg(com.google.android.gms.internal.ads.zzpb r0) {
            boolean r0 = r0.zzc
            return r0
    }

    public final com.google.android.gms.internal.ads.zzpb zza(boolean r1) {
            r0 = this;
            r1 = 1
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzpb zzb(boolean r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzpb zzc(boolean r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzpd zzd() {
            r2 = this;
            boolean r0 = r2.zza
            if (r0 != 0) goto L15
            boolean r0 = r2.zzb
            if (r0 != 0) goto Ld
            boolean r0 = r2.zzc
            if (r0 != 0) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Secondary offload attribute fields are true but primary isFormatSupported is false"
            r0.<init>(r1)
            throw r0
        L15:
            com.google.android.gms.internal.ads.zzpd r0 = new com.google.android.gms.internal.ads.zzpd
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
