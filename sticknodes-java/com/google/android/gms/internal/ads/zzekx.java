package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzekx extends com.google.android.gms.internal.ads.zzely {
    private final com.google.android.gms.internal.ads.zzdgj zza;

    public zzekx(com.google.android.gms.internal.ads.zzcxy r12, com.google.android.gms.internal.ads.zzdfy r13, com.google.android.gms.internal.ads.zzcys r14, com.google.android.gms.internal.ads.zzczh r15, com.google.android.gms.internal.ads.zzczm r16, com.google.android.gms.internal.ads.zzcyn r17, com.google.android.gms.internal.ads.zzdcx r18, com.google.android.gms.internal.ads.zzdgv r19, com.google.android.gms.internal.ads.zzdag r20, com.google.android.gms.internal.ads.zzdgj r21, com.google.android.gms.internal.ads.zzdct r22) {
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r18
            r7 = r20
            r8 = r19
            r9 = r22
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r21
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzely, com.google.android.gms.internal.ads.zzbpr
    public final void zzs(com.google.android.gms.internal.ads.zzbwy r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdgj r0 = r1.zza
            r0.zza(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzely, com.google.android.gms.internal.ads.zzbpr
    public final void zzt(com.google.android.gms.internal.ads.zzbxc r3) throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.ads.zzbwy r0 = new com.google.android.gms.internal.ads.zzbwy
            java.lang.String r1 = r3.zzf()
            int r3 = r3.zze()
            r0.<init>(r1, r3)
            com.google.android.gms.internal.ads.zzdgj r3 = r2.zza
            r3.zza(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzely, com.google.android.gms.internal.ads.zzbpr
    public final void zzu() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdgj r0 = r1.zza
            r0.zzb()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzely, com.google.android.gms.internal.ads.zzbpr
    public final void zzv() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdgj r0 = r1.zza
            r0.zzb()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzely, com.google.android.gms.internal.ads.zzbpr
    public final void zzy() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdgj r0 = r1.zza
            r0.zzc()
            return
    }
}
