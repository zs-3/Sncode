package com.google.android.gms.common.moduleinstall;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ModuleInstallIntentResponseCreator")
/* loaded from: classes.dex */
public class ModuleInstallIntentResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final android.app.PendingIntent zaa;

    static {
            com.google.android.gms.common.moduleinstall.zab r0 = new com.google.android.gms.common.moduleinstall.zab
            r0.<init>()
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    @com.google.android.gms.common.annotation.KeepForSdk
    public ModuleInstallIntentResponse(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.app.PendingIntent r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    public android.app.PendingIntent getPendingIntent() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zaa
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            android.app.PendingIntent r1 = r4.getPendingIntent()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
