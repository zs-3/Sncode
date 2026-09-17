package android.support.customtabs;

/* loaded from: classes.dex */
public interface ICustomTabsCallback extends android.os.IInterface {

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.ICustomTabsCallback {
        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "android.support.customtabs.ICustomTabsCallback"
                r1.attachInterface(r1, r0)
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.customtabs.ICustomTabsCallback"
                if (r5 == r0) goto Le0
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 2: goto Lc3;
                    case 3: goto La6;
                    case 4: goto L8d;
                    case 5: goto L70;
                    case 6: goto L3c;
                    case 7: goto L12;
                    default: goto Ld;
                }
            Ld:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L12:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L28
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L28:
                android.os.Bundle r5 = r4.extraCallbackWithResult(r5, r3)
                r7.writeNoException()
                if (r5 == 0) goto L38
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L3b
            L38:
                r7.writeInt(r0)
            L3b:
                return r1
            L3c:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L52
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L53
            L52:
                r8 = r3
            L53:
                int r2 = r6.readInt()
                if (r2 == 0) goto L5a
                r0 = 1
            L5a:
                int r2 = r6.readInt()
                if (r2 == 0) goto L69
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r2.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L69:
                r4.onRelationshipValidationResult(r5, r8, r0, r3)
                r7.writeNoException()
                return r1
            L70:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L86
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L86:
                r4.onPostMessage(r5, r3)
                r7.writeNoException()
                return r1
            L8d:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L9f
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L9f:
                r4.onMessageChannelReady(r3)
                r7.writeNoException()
                return r1
            La6:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto Lbc
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            Lbc:
                r4.extraCallback(r5, r3)
                r7.writeNoException()
                return r1
            Lc3:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto Ld9
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            Ld9:
                r4.onNavigationEvent(r5, r3)
                r7.writeNoException()
                return r1
            Le0:
                r7.writeString(r2)
                return r1
        }
    }

    void extraCallback(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    android.os.Bundle extraCallbackWithResult(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    void onMessageChannelReady(android.os.Bundle r1) throws android.os.RemoteException;

    void onNavigationEvent(int r1, android.os.Bundle r2) throws android.os.RemoteException;

    void onPostMessage(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    void onRelationshipValidationResult(int r1, android.net.Uri r2, boolean r3, android.os.Bundle r4) throws android.os.RemoteException;
}
