package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.auth.account.zzb {
    public zza() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.account.IWorkAccountCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
            r1 = this;
            r4 = 1
            if (r2 == r4) goto L18
            r5 = 2
            r0 = 0
            if (r2 == r5) goto L8
            return r0
        L8:
            int r2 = com.google.android.gms.internal.auth.zzc.zza
            int r2 = r3.readInt()
            com.google.android.gms.internal.auth.zzc.zzb(r3)
            if (r2 == 0) goto L14
            r0 = 1
        L14:
            r1.zzc(r0)
            goto L26
        L18:
            android.os.Parcelable$Creator r2 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.auth.zzc.zza(r3, r2)
            android.accounts.Account r2 = (android.accounts.Account) r2
            com.google.android.gms.internal.auth.zzc.zzb(r3)
            r1.zzb(r2)
        L26:
            return r4
    }
}
