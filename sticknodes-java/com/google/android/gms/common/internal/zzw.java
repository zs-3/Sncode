package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
public final class zzw extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.IAccountAccessor {
    zzw(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final android.accounts.Account zzb() throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            r1 = 2
            android.os.Parcel r0 = r2.zzB(r1, r0)
            android.os.Parcelable$Creator r1 = android.accounts.Account.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.common.zzc.zza(r0, r1)
            android.accounts.Account r1 = (android.accounts.Account) r1
            r0.recycle()
            return r1
    }
}
