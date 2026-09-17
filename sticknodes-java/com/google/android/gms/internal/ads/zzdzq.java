package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdzq extends com.google.android.gms.internal.ads.zzbvs {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdzr zza;

    protected zzdzq(com.google.android.gms.internal.ads.zzdzr r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zze(com.google.android.gms.ads.internal.util.zzbb r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdzr r0 = r1.zza
            com.google.android.gms.internal.ads.zzcas r0 = r0.zza
            com.google.android.gms.ads.internal.util.zzba r2 = r2.zza()
            r0.zzd(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzf(android.os.ParcelFileDescriptor r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzeah r0 = new com.google.android.gms.internal.ads.zzeah
            android.os.ParcelFileDescriptor$AutoCloseInputStream r1 = new android.os.ParcelFileDescriptor$AutoCloseInputStream
            r1.<init>(r4)
            com.google.android.gms.internal.ads.zzdzr r4 = r3.zza
            com.google.android.gms.internal.ads.zzbwa r2 = r4.zze
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzcas r4 = r4.zza
            r4.zzc(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzg(android.os.ParcelFileDescriptor r3, com.google.android.gms.internal.ads.zzbwa r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzeah r0 = new com.google.android.gms.internal.ads.zzeah
            android.os.ParcelFileDescriptor$AutoCloseInputStream r1 = new android.os.ParcelFileDescriptor$AutoCloseInputStream
            r1.<init>(r3)
            r0.<init>(r1, r4)
            com.google.android.gms.internal.ads.zzdzr r3 = r2.zza
            com.google.android.gms.internal.ads.zzcas r3 = r3.zza
            r3.zzc(r0)
            return
    }
}
