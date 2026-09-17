package android.support.customtabs;

/* loaded from: classes.dex */
public interface ICustomTabsService extends android.os.IInterface {

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.ICustomTabsService {

        private static class Proxy implements android.support.customtabs.ICustomTabsService {
            public static android.support.customtabs.ICustomTabsService sDefaultImpl;
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

            @Override // android.support.customtabs.ICustomTabsService
            public boolean newSession(android.support.customtabs.ICustomTabsCallback r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.customtabs.ICustomTabsService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L48
                    if (r6 == 0) goto L14
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L48
                    goto L15
                L14:
                    r2 = 0
                L15:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L48
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L48
                    r3 = 3
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L48
                    if (r2 != 0) goto L37
                    android.support.customtabs.ICustomTabsService r2 = android.support.customtabs.ICustomTabsService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L48
                    if (r2 == 0) goto L37
                    android.support.customtabs.ICustomTabsService r2 = android.support.customtabs.ICustomTabsService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L48
                    boolean r6 = r2.newSession(r6)     // Catch: java.lang.Throwable -> L48
                    r1.recycle()
                    r0.recycle()
                    return r6
                L37:
                    r1.readException()     // Catch: java.lang.Throwable -> L48
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L48
                    if (r6 == 0) goto L41
                    r4 = 1
                L41:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L48:
                    r6 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback r7, android.os.Bundle r8) throws android.os.RemoteException {
                    r6 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.customtabs.ICustomTabsService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L57
                    if (r7 == 0) goto L14
                    android.os.IBinder r2 = r7.asBinder()     // Catch: java.lang.Throwable -> L57
                    goto L15
                L14:
                    r2 = 0
                L15:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L57
                    r2 = 1
                    r3 = 0
                    if (r8 == 0) goto L23
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L57
                    r8.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L57
                    goto L26
                L23:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L57
                L26:
                    android.os.IBinder r4 = r6.mRemote     // Catch: java.lang.Throwable -> L57
                    r5 = 10
                    boolean r4 = r4.transact(r5, r0, r1, r3)     // Catch: java.lang.Throwable -> L57
                    if (r4 != 0) goto L45
                    android.support.customtabs.ICustomTabsService r4 = android.support.customtabs.ICustomTabsService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L57
                    if (r4 == 0) goto L45
                    android.support.customtabs.ICustomTabsService r2 = android.support.customtabs.ICustomTabsService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L57
                    boolean r7 = r2.newSessionWithExtras(r7, r8)     // Catch: java.lang.Throwable -> L57
                    r1.recycle()
                    r0.recycle()
                    return r7
                L45:
                    r1.readException()     // Catch: java.lang.Throwable -> L57
                    int r7 = r1.readInt()     // Catch: java.lang.Throwable -> L57
                    if (r7 == 0) goto L4f
                    goto L50
                L4f:
                    r2 = 0
                L50:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L57:
                    r7 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r7
            }

            @Override // android.support.customtabs.ICustomTabsService
            public int postMessage(android.support.customtabs.ICustomTabsCallback r6, java.lang.String r7, android.os.Bundle r8) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.customtabs.ICustomTabsService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L56
                    if (r6 == 0) goto L14
                    android.os.IBinder r2 = r6.asBinder()     // Catch: java.lang.Throwable -> L56
                    goto L15
                L14:
                    r2 = 0
                L15:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L56
                    r0.writeString(r7)     // Catch: java.lang.Throwable -> L56
                    r2 = 0
                    if (r8 == 0) goto L26
                    r3 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L56
                    r8.writeToParcel(r0, r2)     // Catch: java.lang.Throwable -> L56
                    goto L29
                L26:
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L56
                L29:
                    android.os.IBinder r3 = r5.mRemote     // Catch: java.lang.Throwable -> L56
                    r4 = 8
                    boolean r2 = r3.transact(r4, r0, r1, r2)     // Catch: java.lang.Throwable -> L56
                    if (r2 != 0) goto L48
                    android.support.customtabs.ICustomTabsService r2 = android.support.customtabs.ICustomTabsService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L56
                    if (r2 == 0) goto L48
                    android.support.customtabs.ICustomTabsService r2 = android.support.customtabs.ICustomTabsService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L56
                    int r6 = r2.postMessage(r6, r7, r8)     // Catch: java.lang.Throwable -> L56
                    r1.recycle()
                    r0.recycle()
                    return r6
                L48:
                    r1.readException()     // Catch: java.lang.Throwable -> L56
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L56
                    r1.recycle()
                    r0.recycle()
                    return r6
                L56:
                    r6 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback r7, android.net.Uri r8) throws android.os.RemoteException {
                    r6 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.customtabs.ICustomTabsService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L56
                    if (r7 == 0) goto L14
                    android.os.IBinder r2 = r7.asBinder()     // Catch: java.lang.Throwable -> L56
                    goto L15
                L14:
                    r2 = 0
                L15:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L56
                    r2 = 1
                    r3 = 0
                    if (r8 == 0) goto L23
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L56
                    r8.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L56
                    goto L26
                L23:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L56
                L26:
                    android.os.IBinder r4 = r6.mRemote     // Catch: java.lang.Throwable -> L56
                    r5 = 7
                    boolean r4 = r4.transact(r5, r0, r1, r3)     // Catch: java.lang.Throwable -> L56
                    if (r4 != 0) goto L44
                    android.support.customtabs.ICustomTabsService r4 = android.support.customtabs.ICustomTabsService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L56
                    if (r4 == 0) goto L44
                    android.support.customtabs.ICustomTabsService r2 = android.support.customtabs.ICustomTabsService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L56
                    boolean r7 = r2.requestPostMessageChannel(r7, r8)     // Catch: java.lang.Throwable -> L56
                    r1.recycle()
                    r0.recycle()
                    return r7
                L44:
                    r1.readException()     // Catch: java.lang.Throwable -> L56
                    int r7 = r1.readInt()     // Catch: java.lang.Throwable -> L56
                    if (r7 == 0) goto L4e
                    goto L4f
                L4e:
                    r2 = 0
                L4f:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L56:
                    r7 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r7
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback r7, android.net.Uri r8, android.os.Bundle r9) throws android.os.RemoteException {
                    r6 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.customtabs.ICustomTabsService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L63
                    if (r7 == 0) goto L14
                    android.os.IBinder r2 = r7.asBinder()     // Catch: java.lang.Throwable -> L63
                    goto L15
                L14:
                    r2 = 0
                L15:
                    r0.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L63
                    r2 = 1
                    r3 = 0
                    if (r8 == 0) goto L23
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L63
                    r8.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L63
                    goto L26
                L23:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L63
                L26:
                    if (r9 == 0) goto L2f
                    r0.writeInt(r2)     // Catch: java.lang.Throwable -> L63
                    r9.writeToParcel(r0, r3)     // Catch: java.lang.Throwable -> L63
                    goto L32
                L2f:
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L63
                L32:
                    android.os.IBinder r4 = r6.mRemote     // Catch: java.lang.Throwable -> L63
                    r5 = 11
                    boolean r4 = r4.transact(r5, r0, r1, r3)     // Catch: java.lang.Throwable -> L63
                    if (r4 != 0) goto L51
                    android.support.customtabs.ICustomTabsService r4 = android.support.customtabs.ICustomTabsService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L63
                    if (r4 == 0) goto L51
                    android.support.customtabs.ICustomTabsService r2 = android.support.customtabs.ICustomTabsService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L63
                    boolean r7 = r2.requestPostMessageChannelWithExtras(r7, r8, r9)     // Catch: java.lang.Throwable -> L63
                    r1.recycle()
                    r0.recycle()
                    return r7
                L51:
                    r1.readException()     // Catch: java.lang.Throwable -> L63
                    int r7 = r1.readInt()     // Catch: java.lang.Throwable -> L63
                    if (r7 == 0) goto L5b
                    goto L5c
                L5b:
                    r2 = 0
                L5c:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L63:
                    r7 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r7
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean warmup(long r6) throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = "android.support.customtabs.ICustomTabsService"
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L40
                    r0.writeLong(r6)     // Catch: java.lang.Throwable -> L40
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L40
                    r3 = 2
                    r4 = 0
                    boolean r2 = r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L40
                    if (r2 != 0) goto L2f
                    android.support.customtabs.ICustomTabsService r2 = android.support.customtabs.ICustomTabsService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L40
                    if (r2 == 0) goto L2f
                    android.support.customtabs.ICustomTabsService r2 = android.support.customtabs.ICustomTabsService.Stub.getDefaultImpl()     // Catch: java.lang.Throwable -> L40
                    boolean r6 = r2.warmup(r6)     // Catch: java.lang.Throwable -> L40
                    r1.recycle()
                    r0.recycle()
                    return r6
                L2f:
                    r1.readException()     // Catch: java.lang.Throwable -> L40
                    int r6 = r1.readInt()     // Catch: java.lang.Throwable -> L40
                    if (r6 == 0) goto L39
                    r4 = 1
                L39:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L40:
                    r6 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r6
            }
        }

        public static android.support.customtabs.ICustomTabsService asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "android.support.customtabs.ICustomTabsService"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.customtabs.ICustomTabsService
                if (r1 == 0) goto L13
                android.support.customtabs.ICustomTabsService r0 = (android.support.customtabs.ICustomTabsService) r0
                return r0
            L13:
                android.support.customtabs.ICustomTabsService$Stub$Proxy r0 = new android.support.customtabs.ICustomTabsService$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        public static android.support.customtabs.ICustomTabsService getDefaultImpl() {
                android.support.customtabs.ICustomTabsService r0 = android.support.customtabs.ICustomTabsService.Stub.Proxy.sDefaultImpl
                return r0
        }
    }

    boolean newSession(android.support.customtabs.ICustomTabsCallback r1) throws android.os.RemoteException;

    boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback r1, android.os.Bundle r2) throws android.os.RemoteException;

    int postMessage(android.support.customtabs.ICustomTabsCallback r1, java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException;

    boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2) throws android.os.RemoteException;

    boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2, android.os.Bundle r3) throws android.os.RemoteException;

    boolean warmup(long r1) throws android.os.RemoteException;
}
