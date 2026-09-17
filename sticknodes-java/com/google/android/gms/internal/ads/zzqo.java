package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzqo {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzos zzb;
    private boolean zzc;
    private final com.google.android.gms.internal.ads.zzqn zzd;
    private com.google.android.gms.internal.ads.zzqq zze;
    private com.google.android.gms.internal.ads.zzqg zzf;

    @java.lang.Deprecated
    public zzqo() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            com.google.android.gms.internal.ads.zzos r0 = com.google.android.gms.internal.ads.zzos.zza
            r1.zzb = r0
            com.google.android.gms.internal.ads.zzqn r0 = com.google.android.gms.internal.ads.zzqn.zza
            r1.zzd = r0
            return
    }

    public zzqo(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            com.google.android.gms.internal.ads.zzos r1 = com.google.android.gms.internal.ads.zzos.zza
            r0.zzb = r1
            com.google.android.gms.internal.ads.zzqn r1 = com.google.android.gms.internal.ads.zzqn.zza
            r0.zzd = r1
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context zza(com.google.android.gms.internal.ads.zzqo r0) {
            android.content.Context r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzos zzb(com.google.android.gms.internal.ads.zzqo r0) {
            com.google.android.gms.internal.ads.zzos r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzqq zzd(com.google.android.gms.internal.ads.zzqo r0) {
            com.google.android.gms.internal.ads.zzqq r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzqg zze(com.google.android.gms.internal.ads.zzqo r0) {
            com.google.android.gms.internal.ads.zzqg r0 = r0.zzf
            return r0
    }

    public final com.google.android.gms.internal.ads.zzrc zzc() {
            r2 = this;
            boolean r0 = r2.zzc
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r2.zzc = r1
            com.google.android.gms.internal.ads.zzqq r0 = r2.zze
            if (r0 != 0) goto L17
            com.google.android.gms.internal.ads.zzqq r0 = new com.google.android.gms.internal.ads.zzqq
            r1 = 0
            com.google.android.gms.internal.ads.zzct[] r1 = new com.google.android.gms.internal.ads.zzct[r1]
            r0.<init>(r1)
            r2.zze = r0
        L17:
            com.google.android.gms.internal.ads.zzqg r0 = r2.zzf
            if (r0 != 0) goto L24
            android.content.Context r0 = r2.zza
            com.google.android.gms.internal.ads.zzqg r1 = new com.google.android.gms.internal.ads.zzqg
            r1.<init>(r0)
            r2.zzf = r1
        L24:
            com.google.android.gms.internal.ads.zzrc r0 = new com.google.android.gms.internal.ads.zzrc
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
