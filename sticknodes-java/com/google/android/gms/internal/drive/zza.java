package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public class zza implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final java.lang.String zzb;

    protected zza(android.os.IBinder r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.zza
            return r0
    }

    protected final android.os.Parcel zza() {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r2.zzb
            r0.writeInterfaceToken(r1)
            return r0
    }

    protected final android.os.Parcel zza(int r4, android.os.Parcel r5) throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r1 = r3.zza     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r2 = 0
            r1.transact(r4, r5, r0, r2)     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r0.readException()     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r5.recycle()
            return r0
        L11:
            r4 = move-exception
            goto L18
        L13:
            r4 = move-exception
            r0.recycle()     // Catch: java.lang.Throwable -> L11
            throw r4     // Catch: java.lang.Throwable -> L11
        L18:
            r5.recycle()
            throw r4
    }

    protected final void zzb(int r4, android.os.Parcel r5) throws android.os.RemoteException {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r1 = r3.zza     // Catch: java.lang.Throwable -> L14
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

    protected final void zzc(int r3, android.os.Parcel r4) throws android.os.RemoteException {
            r2 = this;
            android.os.IBinder r3 = r2.zza     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            r1 = 1
            r3.transact(r1, r4, r0, r1)     // Catch: java.lang.Throwable -> Lb
            r4.recycle()
            return
        Lb:
            r3 = move-exception
            r4.recycle()
            throw r3
    }
}
