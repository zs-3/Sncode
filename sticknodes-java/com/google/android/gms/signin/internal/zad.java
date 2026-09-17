package com.google.android.gms.signin.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements com.google.android.gms.signin.internal.zae {
    public zad() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.signin.internal.ISignInCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            switch(r1) {
                case 3: goto L4c;
                case 4: goto L40;
                case 5: goto L3;
                case 6: goto L34;
                case 7: goto L20;
                case 8: goto L11;
                case 9: goto L5;
                default: goto L3;
            }
        L3:
            r1 = 0
            return r1
        L5:
            android.os.Parcelable$Creator<com.google.android.gms.signin.internal.zag> r1 = com.google.android.gms.signin.internal.zag.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.signin.internal.zag r1 = (com.google.android.gms.signin.internal.zag) r1
            com.google.android.gms.internal.base.zac.zab(r2)
            goto L5f
        L11:
            android.os.Parcelable$Creator<com.google.android.gms.signin.internal.zak> r1 = com.google.android.gms.signin.internal.zak.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.signin.internal.zak r1 = (com.google.android.gms.signin.internal.zak) r1
            com.google.android.gms.internal.base.zac.zab(r2)
            r0.zab(r1)
            goto L5f
        L20:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r1 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r1
            com.google.android.gms.internal.base.zac.zab(r2)
            goto L5f
        L34:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            com.google.android.gms.internal.base.zac.zab(r2)
            goto L5f
        L40:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            com.google.android.gms.internal.base.zac.zab(r2)
            goto L5f
        L4c:
            android.os.Parcelable$Creator<com.google.android.gms.common.ConnectionResult> r1 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.common.ConnectionResult r1 = (com.google.android.gms.common.ConnectionResult) r1
            android.os.Parcelable$Creator<com.google.android.gms.signin.internal.zaa> r1 = com.google.android.gms.signin.internal.zaa.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.signin.internal.zaa r1 = (com.google.android.gms.signin.internal.zaa) r1
            com.google.android.gms.internal.base.zac.zab(r2)
        L5f:
            r3.writeNoException()
            r1 = 1
            return r1
    }
}
