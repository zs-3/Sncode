package com.google.android.gms.internal.p001authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes.dex */
public abstract class zzf extends com.google.android.gms.internal.p001authapiphone.zzb implements com.google.android.gms.internal.p001authapiphone.zzg {
    public zzf() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzb
    protected final boolean zza(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r4 = 0
            r5 = 1
            if (r2 != r5) goto L1a
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r2 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.p001authapiphone.zzc.zza(r3, r2)
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            int r0 = r3.readInt()
            if (r0 == 0) goto L13
            r4 = 1
        L13:
            com.google.android.gms.internal.p001authapiphone.zzc.zzb(r3)
            r1.zzb(r2, r4)
            return r5
        L1a:
            return r4
    }
}
