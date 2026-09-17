package com.google.android.vending.licensing;

/* loaded from: classes2.dex */
public interface ILicensingService extends android.os.IInterface {

    public static abstract class Stub extends android.os.Binder implements com.google.android.vending.licensing.ILicensingService {
        private static final java.lang.String DESCRIPTOR = "com.android.vending.licensing.ILicensingService";
        static final int TRANSACTION_checkLicense = 1;

        private static class Proxy implements com.google.android.vending.licensing.ILicensingService {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mRemote = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.mRemote
                    return r0
            }

            @Override // com.google.android.vending.licensing.ILicensingService
            public void checkLicense(long r3, java.lang.String r5, com.google.android.vending.licensing.ILicenseResultListener r6) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "com.android.vending.licensing.ILicensingService"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L25
                    r0.writeLong(r3)     // Catch: java.lang.Throwable -> L25
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L25
                    r3 = 0
                    if (r6 == 0) goto L17
                    android.os.IBinder r4 = r6.asBinder()     // Catch: java.lang.Throwable -> L25
                    goto L18
                L17:
                    r4 = r3
                L18:
                    r0.writeStrongBinder(r4)     // Catch: java.lang.Throwable -> L25
                    android.os.IBinder r4 = r2.mRemote     // Catch: java.lang.Throwable -> L25
                    r5 = 1
                    r4.transact(r5, r0, r3, r5)     // Catch: java.lang.Throwable -> L25
                    r0.recycle()
                    return
                L25:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "com.android.vending.licensing.ILicensingService"
                    return r0
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.android.vending.licensing.ILicensingService"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.google.android.vending.licensing.ILicensingService asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.android.vending.licensing.ILicensingService"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.google.android.vending.licensing.ILicensingService
                if (r1 == 0) goto L13
                com.google.android.vending.licensing.ILicensingService r0 = (com.google.android.vending.licensing.ILicensingService) r0
                return r0
            L13:
                com.google.android.vending.licensing.ILicensingService$Stub$Proxy r0 = new com.google.android.vending.licensing.ILicensingService$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
                r3 = this;
                java.lang.String r0 = "com.android.vending.licensing.ILicensingService"
                r1 = 1
                if (r4 == r1) goto L13
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto Lf
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            Lf:
                r6.writeString(r0)
                return r1
            L13:
                r5.enforceInterface(r0)
                long r6 = r5.readLong()
                java.lang.String r4 = r5.readString()
                android.os.IBinder r5 = r5.readStrongBinder()
                com.google.android.vending.licensing.ILicenseResultListener r5 = com.google.android.vending.licensing.ILicenseResultListener.Stub.asInterface(r5)
                r3.checkLicense(r6, r4, r5)
                return r1
        }
    }

    void checkLicense(long r1, java.lang.String r3, com.google.android.vending.licensing.ILicenseResultListener r4) throws android.os.RemoteException;
}
