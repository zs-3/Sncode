package com.google.android.vending.licensing;

/* loaded from: classes2.dex */
public interface ILicenseResultListener extends android.os.IInterface {

    public static abstract class Stub extends android.os.Binder implements com.google.android.vending.licensing.ILicenseResultListener {
        private static final java.lang.String DESCRIPTOR = "com.android.vending.licensing.ILicenseResultListener";
        static final int TRANSACTION_verifyLicense = 1;

        private static class Proxy implements com.google.android.vending.licensing.ILicenseResultListener {
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

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "com.android.vending.licensing.ILicenseResultListener"
                    return r0
            }

            @Override // com.google.android.vending.licensing.ILicenseResultListener
            public void verifyLicense(int r3, java.lang.String r4, java.lang.String r5) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "com.android.vending.licensing.ILicenseResultListener"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1d
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L1d
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L1d
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L1d
                    android.os.IBinder r3 = r2.mRemote     // Catch: java.lang.Throwable -> L1d
                    r4 = 0
                    r5 = 1
                    r3.transact(r5, r0, r4, r5)     // Catch: java.lang.Throwable -> L1d
                    r0.recycle()
                    return
                L1d:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.android.vending.licensing.ILicenseResultListener"
                r1.attachInterface(r1, r0)
                return
        }

        public static com.google.android.vending.licensing.ILicenseResultListener asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.android.vending.licensing.ILicenseResultListener"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof com.google.android.vending.licensing.ILicenseResultListener
                if (r1 == 0) goto L13
                com.google.android.vending.licensing.ILicenseResultListener r0 = (com.google.android.vending.licensing.ILicenseResultListener) r0
                return r0
            L13:
                com.google.android.vending.licensing.ILicenseResultListener$Stub$Proxy r0 = new com.google.android.vending.licensing.ILicenseResultListener$Stub$Proxy
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
                java.lang.String r0 = "com.android.vending.licensing.ILicenseResultListener"
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
                int r4 = r5.readInt()
                java.lang.String r6 = r5.readString()
                java.lang.String r5 = r5.readString()
                r3.verifyLicense(r4, r6, r5)
                return r1
        }
    }

    void verifyLicense(int r1, java.lang.String r2, java.lang.String r3) throws android.os.RemoteException;
}
