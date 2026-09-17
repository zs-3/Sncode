package com.google.android.gms.common.moduleinstall;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ModuleInstallResponseCreator")
/* loaded from: classes.dex */
public class ModuleInstallResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.ModuleInstallResponse> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSessionId", id = 1)
    private final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "false", getter = "getShouldUnregisterListener", id = 2)
    private final boolean zab;

    static {
            com.google.android.gms.common.moduleinstall.zad r0 = new com.google.android.gms.common.moduleinstall.zad
            r0.<init>()
            com.google.android.gms.common.moduleinstall.ModuleInstallResponse.CREATOR = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public ModuleInstallResponse(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ModuleInstallResponse(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    public boolean areModulesAlreadyInstalled() {
            r1 = this;
            int r0 = r1.zaa
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int getSessionId() {
            r1 = this;
            int r0 = r1.zaa
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            int r0 = r2.getSessionId()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r0)
            boolean r0 = r2.zab
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }

    public final boolean zaa() {
            r1 = this;
            boolean r0 = r1.zab
            return r0
    }
}
