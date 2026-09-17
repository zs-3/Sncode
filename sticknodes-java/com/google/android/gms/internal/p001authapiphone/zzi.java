package com.google.android.gms.internal.p001authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes.dex */
public abstract class zzi extends com.google.android.gms.internal.p001authapiphone.zzb implements com.google.android.gms.internal.p001authapiphone.zzj {
    public zzi() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzb
    protected final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r3 = 1
            if (r1 != r3) goto L12
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.p001authapiphone.zzc.zza(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            com.google.android.gms.internal.p001authapiphone.zzc.zzb(r2)
            r0.zzb(r1)
            return r3
        L12:
            r1 = 0
            return r1
    }
}
