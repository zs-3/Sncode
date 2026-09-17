package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

/* loaded from: classes2.dex */
public class ObjectDescriptorFactory {
    protected static java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.lang.Class<? extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor>>> descriptorRegistry;
    protected static java.util.logging.Logger log;

    static {
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.log = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.descriptorRegistry = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo.class
            r0.add(r1)
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor.class
            r0.add(r1)
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor.class
            r0.add(r1)
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionDescriptor> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionDescriptor.class
            r0.add(r1)
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorBase> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorBase.class
            r0.add(r1)
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ProfileLevelIndicationDescriptor.class
            r0.add(r1)
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig.class
            r0.add(r1)
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionProfileLevelDescriptor> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionProfileLevelDescriptor.class
            r0.add(r1)
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor.class
            r0.add(r1)
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor.class
            r0.add(r1)
            java.util.Iterator r0 = r0.iterator()
        L4e:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L55
            return
        L55:
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.Descriptor> r2 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.Descriptor.class
            java.lang.annotation.Annotation r2 = r1.getAnnotation(r2)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.Descriptor r2 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.Descriptor) r2
            int[] r3 = r2.tags()
            int r2 = r2.objectTypeIndication()
            java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.lang.Class<? extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor>>> r4 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.descriptorRegistry
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r4.get(r5)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 != 0) goto L7e
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L7e:
            int r5 = r3.length
            r6 = 0
        L80:
            if (r6 < r5) goto L8c
            java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.lang.Class<? extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor>>> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.descriptorRegistry
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r4)
            goto L4e
        L8c:
            r7 = r3[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.put(r7, r1)
            int r6 = r6 + 1
            goto L80
    }

    public ObjectDescriptorFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor createFrom(int r7, java.nio.ByteBuffer r8) throws java.io.IOException {
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r8)
            java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.lang.Class<? extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor>>> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.descriptorRegistry
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r1.get(r2)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L1f
            java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.lang.Class<? extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor>>> r1 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.descriptorRegistry
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.util.Map r1 = (java.util.Map) r1
        L1f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r2 = " and tag "
            if (r1 == 0) goto L6f
            boolean r3 = r1.isInterface()
            if (r3 != 0) goto L6f
            int r3 = r1.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isAbstract(r3)
            if (r3 == 0) goto L3e
            goto L6f
        L3e:
            java.lang.Object r3 = r1.newInstance()     // Catch: java.lang.Exception -> L45
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r3 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor) r3     // Catch: java.lang.Exception -> L45
            goto L9d
        L45:
            r8 = move-exception
            java.util.logging.Logger r3 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.log
            java.util.logging.Level r4 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Couldn't instantiate BaseDescriptor class "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = " for objectTypeIndication "
            r5.append(r1)
            r5.append(r7)
            r5.append(r2)
            r5.append(r0)
            java.lang.String r7 = r5.toString()
            r3.log(r4, r7, r8)
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r8)
            throw r7
        L6f:
            java.util.logging.Logger r3 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.log
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "No ObjectDescriptor found for objectTypeIndication "
            r4.<init>(r5)
            java.lang.String r7 = java.lang.Integer.toHexString(r7)
            r4.append(r7)
            r4.append(r2)
            java.lang.String r7 = java.lang.Integer.toHexString(r0)
            r4.append(r7)
            java.lang.String r7 = " found: "
            r4.append(r7)
            r4.append(r1)
            java.lang.String r7 = r4.toString()
            r3.warning(r7)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.UnknownDescriptor r3 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.UnknownDescriptor
            r3.<init>()
        L9d:
            r3.parse(r0, r8)
            return r3
    }
}
