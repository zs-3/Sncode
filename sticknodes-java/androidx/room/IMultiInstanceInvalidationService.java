package androidx.room;

/* loaded from: classes.dex */
public interface IMultiInstanceInvalidationService extends android.os.IInterface {

    public static abstract class Stub extends android.os.Binder implements androidx.room.IMultiInstanceInvalidationService {

        private static class Proxy implements androidx.room.IMultiInstanceInvalidationService {
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

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void broadcastInvalidation(int r4, java.lang.String[] r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.room.IMultiInstanceInvalidationService"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1b
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1b
                    r0.writeStringArray(r5)     // Catch: java.lang.Throwable -> L1b
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L1b
                    r5 = 3
                    r1 = 0
                    r2 = 1
                    r4.transact(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L1b
                    r0.recycle()
                    return
                L1b:
                    r4 = move-exception
                    r0.recycle()
                    throw r4
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public int registerCallback(androidx.room.IMultiInstanceInvalidationCallback r4, java.lang.String r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "androidx.room.IMultiInstanceInvalidationService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    if (r4 == 0) goto L14
                    android.os.IBinder r4 = r4.asBinder()     // Catch: java.lang.Throwable -> L30
                    goto L15
                L14:
                    r4 = 0
                L15:
                    r0.writeStrongBinder(r4)     // Catch: java.lang.Throwable -> L30
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L30
                    r5 = 1
                    r2 = 0
                    r4.transact(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L30
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    int r4 = r1.readInt()     // Catch: java.lang.Throwable -> L30
                    r1.recycle()
                    r0.recycle()
                    return r4
                L30:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void unregisterCallback(androidx.room.IMultiInstanceInvalidationCallback r4, int r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "androidx.room.IMultiInstanceInvalidationService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    if (r4 == 0) goto L14
                    android.os.IBinder r4 = r4.asBinder()     // Catch: java.lang.Throwable -> L2c
                    goto L15
                L14:
                    r4 = 0
                L15:
                    r0.writeStrongBinder(r4)     // Catch: java.lang.Throwable -> L2c
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L2c
                    r5 = 2
                    r2 = 0
                    r4.transact(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L2c
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return
                L2c:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "androidx.room.IMultiInstanceInvalidationService"
                r1.attachInterface(r1, r0)
                return
        }

        public static androidx.room.IMultiInstanceInvalidationService asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "androidx.room.IMultiInstanceInvalidationService"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof androidx.room.IMultiInstanceInvalidationService
                if (r1 == 0) goto L13
                androidx.room.IMultiInstanceInvalidationService r0 = (androidx.room.IMultiInstanceInvalidationService) r0
                return r0
            L13:
                androidx.room.IMultiInstanceInvalidationService$Stub$Proxy r0 = new androidx.room.IMultiInstanceInvalidationService$Stub$Proxy
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
                java.lang.String r1 = "androidx.room.IMultiInstanceInvalidationService"
                if (r4 == r0) goto L3e
                r2 = 2
                if (r4 == r2) goto L28
                r2 = 3
                if (r4 == r2) goto L19
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L15
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L15:
                r6.writeString(r1)
                return r0
            L19:
                r5.enforceInterface(r1)
                int r4 = r5.readInt()
                java.lang.String[] r5 = r5.createStringArray()
                r3.broadcastInvalidation(r4, r5)
                return r0
            L28:
                r5.enforceInterface(r1)
                android.os.IBinder r4 = r5.readStrongBinder()
                androidx.room.IMultiInstanceInvalidationCallback r4 = androidx.room.IMultiInstanceInvalidationCallback.Stub.asInterface(r4)
                int r5 = r5.readInt()
                r3.unregisterCallback(r4, r5)
                r6.writeNoException()
                return r0
            L3e:
                r5.enforceInterface(r1)
                android.os.IBinder r4 = r5.readStrongBinder()
                androidx.room.IMultiInstanceInvalidationCallback r4 = androidx.room.IMultiInstanceInvalidationCallback.Stub.asInterface(r4)
                java.lang.String r5 = r5.readString()
                int r4 = r3.registerCallback(r4, r5)
                r6.writeNoException()
                r6.writeInt(r4)
                return r0
        }
    }

    void broadcastInvalidation(int r1, java.lang.String[] r2) throws android.os.RemoteException;

    int registerCallback(androidx.room.IMultiInstanceInvalidationCallback r1, java.lang.String r2) throws android.os.RemoteException;

    void unregisterCallback(androidx.room.IMultiInstanceInvalidationCallback r1, int r2) throws android.os.RemoteException;
}
