package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public class zba implements android.os.IInterface {
    private final android.os.IBinder zba;
    private final java.lang.String zbb;

    protected zba(android.os.IBinder r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            r0.zbb = r2
            return
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.zba
            return r0
    }

    protected final android.os.Parcel zba() {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r2.zbb
            r0.writeInterfaceToken(r1)
            return r0
    }

    protected final void zbb(int r4, android.os.Parcel r5) throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r1 = r3.zba     // Catch: java.lang.Throwable -> L14
            r2 = 0
            r1.transact(r4, r5, r0, r2)     // Catch: java.lang.Throwable -> L14
            r0.readException()     // Catch: java.lang.Throwable -> L14
            r5.recycle()
            r0.recycle()
            return
        L14:
            r4 = move-exception
            r5.recycle()
            r0.recycle()
            throw r4
    }
}
