package com.google.android.gms.common.moduleinstall.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public abstract class zag extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.moduleinstall.internal.zah {
    public zag() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r3 = 1
            if (r1 != r3) goto L12
            android.os.Parcelable$Creator<com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate> r1 = com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.base.zac.zaa(r2, r1)
            com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate r1 = (com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate) r1
            com.google.android.gms.internal.base.zac.zab(r2)
            r0.zab(r1)
            return r3
        L12:
            r1 = 0
            return r1
    }
}
