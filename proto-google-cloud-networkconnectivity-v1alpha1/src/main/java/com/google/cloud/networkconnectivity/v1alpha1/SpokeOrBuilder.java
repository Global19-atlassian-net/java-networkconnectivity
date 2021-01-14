/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkconnectivity/v1alpha1/hub.proto

package com.google.cloud.networkconnectivity.v1alpha1;

public interface SpokeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkconnectivity.v1alpha1.Spoke)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The name of a Spoke resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The name of a Spoke resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The time when the Spoke was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time when the Spoke was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time when the Spoke was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the Spoke was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The time when the Spoke was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The time when the Spoke was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Short description of the spoke resource
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Short description of the spoke resource
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The resource URL of the hub resource that the spoke is attached to
   * </pre>
   *
   * <code>string hub = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The hub.
   */
  java.lang.String getHub();
  /**
   *
   *
   * <pre>
   * The resource URL of the hub resource that the spoke is attached to
   * </pre>
   *
   * <code>string hub = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for hub.
   */
  com.google.protobuf.ByteString getHubBytes();

  /**
   *
   *
   * <pre>
   * The URIs of linked VPN tunnel resources
   * </pre>
   *
   * <code>repeated string linked_vpn_tunnels = 12 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the linkedVpnTunnels.
   */
  java.util.List<java.lang.String> getLinkedVpnTunnelsList();
  /**
   *
   *
   * <pre>
   * The URIs of linked VPN tunnel resources
   * </pre>
   *
   * <code>repeated string linked_vpn_tunnels = 12 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of linkedVpnTunnels.
   */
  int getLinkedVpnTunnelsCount();
  /**
   *
   *
   * <pre>
   * The URIs of linked VPN tunnel resources
   * </pre>
   *
   * <code>repeated string linked_vpn_tunnels = 12 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The linkedVpnTunnels at the given index.
   */
  java.lang.String getLinkedVpnTunnels(int index);
  /**
   *
   *
   * <pre>
   * The URIs of linked VPN tunnel resources
   * </pre>
   *
   * <code>repeated string linked_vpn_tunnels = 12 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the linkedVpnTunnels at the given index.
   */
  com.google.protobuf.ByteString getLinkedVpnTunnelsBytes(int index);

  /**
   *
   *
   * <pre>
   * The URIs of linked interconnect attachment resources
   * </pre>
   *
   * <code>
   * repeated string linked_interconnect_attachments = 13 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the linkedInterconnectAttachments.
   */
  java.util.List<java.lang.String> getLinkedInterconnectAttachmentsList();
  /**
   *
   *
   * <pre>
   * The URIs of linked interconnect attachment resources
   * </pre>
   *
   * <code>
   * repeated string linked_interconnect_attachments = 13 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of linkedInterconnectAttachments.
   */
  int getLinkedInterconnectAttachmentsCount();
  /**
   *
   *
   * <pre>
   * The URIs of linked interconnect attachment resources
   * </pre>
   *
   * <code>
   * repeated string linked_interconnect_attachments = 13 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The linkedInterconnectAttachments at the given index.
   */
  java.lang.String getLinkedInterconnectAttachments(int index);
  /**
   *
   *
   * <pre>
   * The URIs of linked interconnect attachment resources
   * </pre>
   *
   * <code>
   * repeated string linked_interconnect_attachments = 13 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the linkedInterconnectAttachments at the given index.
   */
  com.google.protobuf.ByteString getLinkedInterconnectAttachmentsBytes(int index);

  /**
   *
   *
   * <pre>
   * The URIs of linked Router appliance resources
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance linked_router_appliance_instances = 14;
   * </code>
   */
  java.util.List<com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance>
      getLinkedRouterApplianceInstancesList();
  /**
   *
   *
   * <pre>
   * The URIs of linked Router appliance resources
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance linked_router_appliance_instances = 14;
   * </code>
   */
  com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance
      getLinkedRouterApplianceInstances(int index);
  /**
   *
   *
   * <pre>
   * The URIs of linked Router appliance resources
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance linked_router_appliance_instances = 14;
   * </code>
   */
  int getLinkedRouterApplianceInstancesCount();
  /**
   *
   *
   * <pre>
   * The URIs of linked Router appliance resources
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance linked_router_appliance_instances = 14;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstanceOrBuilder>
      getLinkedRouterApplianceInstancesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The URIs of linked Router appliance resources
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstance linked_router_appliance_instances = 14;
   * </code>
   */
  com.google.cloud.networkconnectivity.v1alpha1.RouterApplianceInstanceOrBuilder
      getLinkedRouterApplianceInstancesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Google-generated UUID for this resource. This is unique across all Spoke
   * resources. If a Spoke resource is deleted and another with the same name is
   * created, it gets a different unique_id.
   * </pre>
   *
   * <code>string unique_id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uniqueId.
   */
  java.lang.String getUniqueId();
  /**
   *
   *
   * <pre>
   * Output only. Google-generated UUID for this resource. This is unique across all Spoke
   * resources. If a Spoke resource is deleted and another with the same name is
   * created, it gets a different unique_id.
   * </pre>
   *
   * <code>string unique_id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uniqueId.
   */
  com.google.protobuf.ByteString getUniqueIdBytes();
}
