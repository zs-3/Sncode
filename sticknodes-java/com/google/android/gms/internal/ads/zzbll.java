package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbll extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzblm {
    public zzbll() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r3 = 1
            if (r1 != r3) goto L12
            android.os.Parcelable$Creator r1 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzayn.zza(r2, r1)
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
            com.google.android.gms.internal.ads.zzayn.zzc(r2)
            r0.zzb(r1)
            return r3
        L12:
            r1 = 0
            return r1
    }
}
