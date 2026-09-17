package com.google.android.gms.internal.appset;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public abstract class zze extends com.google.android.gms.internal.appset.zzb implements com.google.android.gms.internal.appset.zzf {
    public zze() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.appset.internal.IAppSetIdCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.appset.zzb
    protected final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r3 = 1
            if (r1 != r3) goto L17
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.appset.zzc.zza(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            android.os.Parcelable$Creator<com.google.android.gms.appset.zzc> r4 = com.google.android.gms.appset.zzc.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.appset.zzc.zza(r2, r4)
            com.google.android.gms.appset.zzc r2 = (com.google.android.gms.appset.zzc) r2
            r0.zzb(r1, r2)
            return r3
        L17:
            r1 = 0
            return r1
    }
}
