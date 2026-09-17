package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class zam extends com.google.android.gms.internal.base.zaa {
    zam(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ISignInButtonCreator"
            r1.<init>(r2, r0)
            return
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zae(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.common.internal.zax r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            com.google.android.gms.internal.base.zac.zad(r0, r2)
            com.google.android.gms.internal.base.zac.zac(r0, r3)
            r2 = 2
            android.os.Parcel r2 = r1.zab(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            r2.recycle()
            return r3
    }
}
