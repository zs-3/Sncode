package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes2.dex */
public final class AutoRolloutAssignmentEncoder implements com.google.firebase.encoders.config.Configurator {
    public static final com.google.firebase.encoders.config.Configurator CONFIG = null;

    private static final class RolloutAssignmentEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> {
        static final com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor PARAMETERKEY_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor PARAMETERVALUE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor ROLLOUTID_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor TEMPLATEVERSION_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor VARIANTID_DESCRIPTOR = null;

        static {
                com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder$RolloutAssignmentEncoder r0 = new com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder$RolloutAssignmentEncoder
                r0.<init>()
                com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.INSTANCE = r0
                java.lang.String r0 = "rolloutId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.ROLLOUTID_DESCRIPTOR = r0
                java.lang.String r0 = "parameterKey"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.PARAMETERKEY_DESCRIPTOR = r0
                java.lang.String r0 = "parameterValue"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.PARAMETERVALUE_DESCRIPTOR = r0
                java.lang.String r0 = "variantId"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.VARIANTID_DESCRIPTOR = r0
                java.lang.String r0 = "templateVersion"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.TEMPLATEVERSION_DESCRIPTOR = r0
                return
        }

        private RolloutAssignmentEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.ROLLOUTID_DESCRIPTOR
                java.lang.String r1 = r4.getRolloutId()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.PARAMETERKEY_DESCRIPTOR
                java.lang.String r1 = r4.getParameterKey()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.PARAMETERVALUE_DESCRIPTOR
                java.lang.String r1 = r4.getParameterValue()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.VARIANTID_DESCRIPTOR
                java.lang.String r1 = r4.getVariantId()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.TEMPLATEVERSION_DESCRIPTOR
                long r1 = r4.getTemplateVersion()
                r5.add(r0, r1)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.firebase.crashlytics.internal.metadata.RolloutAssignment r1 = (com.google.firebase.crashlytics.internal.metadata.RolloutAssignment) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    static {
            com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder r0 = new com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder
            r0.<init>()
            com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.CONFIG = r0
            return
    }

    private AutoRolloutAssignmentEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(com.google.firebase.encoders.config.EncoderConfig<?> r3) {
            r2 = this;
            java.lang.Class<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> r0 = com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.class
            com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder$RolloutAssignmentEncoder r1 = com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.firebase.crashlytics.internal.metadata.AutoValue_RolloutAssignment> r0 = com.google.firebase.crashlytics.internal.metadata.AutoValue_RolloutAssignment.class
            r3.registerEncoder(r0, r1)
            return
    }
}
