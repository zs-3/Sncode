package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeoo {
    private final com.google.android.gms.internal.ads.zzdla zza;
    private final com.google.android.gms.internal.ads.zzeob zzb;
    private final com.google.android.gms.internal.ads.zzcyd zzc;

    public zzeoo(com.google.android.gms.internal.ads.zzdla r2, com.google.android.gms.internal.ads.zzdud r3) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            com.google.android.gms.internal.ads.zzeob r0 = new com.google.android.gms.internal.ads.zzeob
            r0.<init>(r3)
            r1.zzb = r0
            com.google.android.gms.internal.ads.zzbmp r2 = r2.zzg()
            com.google.android.gms.internal.ads.zzeon r3 = new com.google.android.gms.internal.ads.zzeon
            r3.<init>(r0, r2)
            r1.zzc = r3
            return
    }

    public final com.google.android.gms.internal.ads.zzcyd zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcyd r0 = r1.zzc
            return r0
    }

    public final com.google.android.gms.internal.ads.zzczo zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r1.zzb
            return r0
    }

    public final com.google.android.gms.internal.ads.zzdit zzc() {
            r3 = this;
            com.google.android.gms.internal.ads.zzdit r0 = new com.google.android.gms.internal.ads.zzdit
            com.google.android.gms.internal.ads.zzeob r1 = r3.zzb
            com.google.android.gms.internal.ads.zzdla r2 = r3.zza
            com.google.android.gms.ads.internal.client.zzbl r1 = r1.zzg()
            r0.<init>(r2, r1)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzeob zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r1.zzb
            return r0
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbl r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r1.zzb
            r0.zzj(r2)
            return
    }
}
