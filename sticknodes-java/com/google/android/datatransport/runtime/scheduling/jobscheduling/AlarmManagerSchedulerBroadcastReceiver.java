package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends android.content.BroadcastReceiver {
    public static /* synthetic */ void $r8$lambda$q4r8Prrhwgwy92BqYzk7wqZKIis() {
            lambda$onReceive$0()
            return
    }

    public AlarmManagerSchedulerBroadcastReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ void lambda$onReceive$0() {
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            android.net.Uri r0 = r6.getData()
            java.lang.String r1 = "backendName"
            java.lang.String r0 = r0.getQueryParameter(r1)
            android.net.Uri r1 = r6.getData()
            java.lang.String r2 = "extras"
            java.lang.String r1 = r1.getQueryParameter(r2)
            android.net.Uri r2 = r6.getData()
            java.lang.String r3 = "priority"
            java.lang.String r2 = r2.getQueryParameter(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r2.intValue()
            android.os.Bundle r6 = r6.getExtras()
            java.lang.String r3 = "attemptNumber"
            int r6 = r6.getInt(r3)
            com.google.android.datatransport.runtime.TransportRuntime.initialize(r5)
            com.google.android.datatransport.runtime.TransportContext$Builder r5 = com.google.android.datatransport.runtime.TransportContext.builder()
            com.google.android.datatransport.runtime.TransportContext$Builder r5 = r5.setBackendName(r0)
            com.google.android.datatransport.Priority r0 = com.google.android.datatransport.runtime.util.PriorityMapping.valueOf(r2)
            com.google.android.datatransport.runtime.TransportContext$Builder r5 = r5.setPriority(r0)
            if (r1 == 0) goto L4d
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r1, r0)
            r5.setExtras(r0)
        L4d:
            com.google.android.datatransport.runtime.TransportRuntime r0 = com.google.android.datatransport.runtime.TransportRuntime.getInstance()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0 = r0.getUploader()
            com.google.android.datatransport.runtime.TransportContext r5 = r5.build()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver$$ExternalSyntheticLambda0 r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver$$ExternalSyntheticLambda0.INSTANCE
            r0.upload(r5, r6, r1)
            return
    }
}
