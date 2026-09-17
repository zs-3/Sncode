package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbvp extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbvq {
    public zzbvp() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    protected final boolean zzdF(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L17
            r0 = 2
            if (r2 == r0) goto L8
            r2 = 0
            return r2
        L8:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.util.zzbb> r2 = com.google.android.gms.ads.internal.util.zzbb.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            com.google.android.gms.ads.internal.util.zzbb r2 = (com.google.android.gms.ads.internal.util.zzbb) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zze(r2)
            goto L25
        L17:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzayn.zza(r3, r2)
            android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
            com.google.android.gms.internal.ads.zzayn.zzc(r3)
            r1.zzf(r2)
        L25:
            r4.writeNoException()
            return r5
    }
}
