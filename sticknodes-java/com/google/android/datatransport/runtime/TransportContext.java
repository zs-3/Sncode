package com.google.android.datatransport.runtime;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
public abstract class TransportContext {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.runtime.TransportContext build();

        public abstract com.google.android.datatransport.runtime.TransportContext.Builder setBackendName(java.lang.String r1);

        public abstract com.google.android.datatransport.runtime.TransportContext.Builder setExtras(byte[] r1);

        public abstract com.google.android.datatransport.runtime.TransportContext.Builder setPriority(com.google.android.datatransport.Priority r1);
    }

    public TransportContext() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.TransportContext.Builder builder() {
            com.google.android.datatransport.runtime.AutoValue_TransportContext$Builder r0 = new com.google.android.datatransport.runtime.AutoValue_TransportContext$Builder
            r0.<init>()
            com.google.android.datatransport.Priority r1 = com.google.android.datatransport.Priority.DEFAULT
            com.google.android.datatransport.runtime.TransportContext$Builder r0 = r0.setPriority(r1)
            return r0
    }

    public abstract java.lang.String getBackendName();

    public abstract byte[] getExtras();

    public abstract com.google.android.datatransport.Priority getPriority();

    public boolean shouldUploadClientHealthMetrics() {
            r1 = this;
            byte[] r0 = r1.getExtras()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.getBackendName()
            r2 = 0
            r0[r2] = r1
            com.google.android.datatransport.Priority r1 = r3.getPriority()
            r2 = 1
            r0[r2] = r1
            byte[] r1 = r3.getExtras()
            r2 = 2
            if (r1 != 0) goto L1b
            java.lang.String r1 = ""
            goto L23
        L1b:
            byte[] r1 = r3.getExtras()
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
        L23:
            r0[r2] = r1
            java.lang.String r1 = "TransportContext(%s, %s, %s)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    public com.google.android.datatransport.runtime.TransportContext withPriority(com.google.android.datatransport.Priority r3) {
            r2 = this;
            com.google.android.datatransport.runtime.TransportContext$Builder r0 = builder()
            java.lang.String r1 = r2.getBackendName()
            com.google.android.datatransport.runtime.TransportContext$Builder r0 = r0.setBackendName(r1)
            com.google.android.datatransport.runtime.TransportContext$Builder r3 = r0.setPriority(r3)
            byte[] r0 = r2.getExtras()
            com.google.android.datatransport.runtime.TransportContext$Builder r3 = r3.setExtras(r0)
            com.google.android.datatransport.runtime.TransportContext r3 = r3.build()
            return r3
    }
}
