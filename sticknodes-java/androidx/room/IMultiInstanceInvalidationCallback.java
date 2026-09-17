package androidx.room;

/* loaded from: classes.dex */
public interface IMultiInstanceInvalidationCallback extends android.os.IInterface {

    public static abstract class Stub extends android.os.Binder implements androidx.room.IMultiInstanceInvalidationCallback {

        private static class Proxy implements androidx.room.IMultiInstanceInvalidationCallback {
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

            @Override // androidx.room.IMultiInstanceInvalidationCallback
            public void onInvalidation(java.lang.String[] r4) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.room.IMultiInstanceInvalidationCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L17
                    r0.writeStringArray(r4)     // Catch: java.lang.Throwable -> L17
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L17
                    r1 = 0
                    r2 = 1
                    r4.transact(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L17
                    r0.recycle()
                    return
                L17:
                    r4 = move-exception
                    r0.recycle()
                    throw r4
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "androidx.room.IMultiInstanceInvalidationCallback"
                r1.attachInterface(r1, r0)
                return
        }

        public static androidx.room.IMultiInstanceInvalidationCallback asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "androidx.room.IMultiInstanceInvalidationCallback"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof androidx.room.IMultiInstanceInvalidationCallback
                if (r1 == 0) goto L13
                androidx.room.IMultiInstanceInvalidationCallback r0 = (androidx.room.IMultiInstanceInvalidationCallback) r0
                return r0
            L13:
                androidx.room.IMultiInstanceInvalidationCallback$Stub$Proxy r0 = new androidx.room.IMultiInstanceInvalidationCallback$Stub$Proxy
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
                r0 = 1
                java.lang.String r1 = "androidx.room.IMultiInstanceInvalidationCallback"
                if (r4 == r0) goto L13
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto Lf
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            Lf:
                r6.writeString(r1)
                return r0
            L13:
                r5.enforceInterface(r1)
                java.lang.String[] r4 = r5.createStringArray()
                r3.onInvalidation(r4)
                return r0
        }
    }

    void onInvalidation(java.lang.String[] r1) throws android.os.RemoteException;
}
