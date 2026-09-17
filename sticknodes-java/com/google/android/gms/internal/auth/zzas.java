package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public abstract class zzas extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzat {
    public zzas() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            switch(r1) {
                case 1: goto L60;
                case 2: goto L49;
                case 3: goto L32;
                case 4: goto L2e;
                case 5: goto L1f;
                case 6: goto L14;
                case 7: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.accounttransfer.DeviceMetaData> r1 = com.google.android.gms.auth.api.accounttransfer.DeviceMetaData.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.auth.zzc.zza(r2, r1)
            com.google.android.gms.auth.api.accounttransfer.DeviceMetaData r1 = (com.google.android.gms.auth.api.accounttransfer.DeviceMetaData) r1
            com.google.android.gms.internal.auth.zzc.zzb(r2)
            r0.zzc(r1)
            goto L6e
        L14:
            byte[] r1 = r2.createByteArray()
            com.google.android.gms.internal.auth.zzc.zzb(r2)
            r0.zzb(r1)
            goto L6e
        L1f:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.auth.zzc.zza(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            com.google.android.gms.internal.auth.zzc.zzb(r2)
            r0.zzd(r1)
            goto L6e
        L2e:
            r0.zze()
            goto L6e
        L32:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.auth.zzc.zza(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.accounttransfer.zzo> r3 = com.google.android.gms.auth.api.accounttransfer.zzo.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.auth.zzc.zza(r2, r3)
            com.google.android.gms.auth.api.accounttransfer.zzo r3 = (com.google.android.gms.auth.api.accounttransfer.zzo) r3
            com.google.android.gms.internal.auth.zzc.zzb(r2)
            r0.zzg(r1, r3)
            goto L6e
        L49:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.auth.zzc.zza(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.accounttransfer.zzw> r3 = com.google.android.gms.auth.api.accounttransfer.zzw.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.auth.zzc.zza(r2, r3)
            com.google.android.gms.auth.api.accounttransfer.zzw r3 = (com.google.android.gms.auth.api.accounttransfer.zzw) r3
            com.google.android.gms.internal.auth.zzc.zzb(r2)
            r0.zzf(r1, r3)
            goto L6e
        L60:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.auth.zzc.zza(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            com.google.android.gms.internal.auth.zzc.zzb(r2)
            r0.zzh(r1)
        L6e:
            r1 = 1
            return r1
    }
}
