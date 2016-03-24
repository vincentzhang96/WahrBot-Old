/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Vincent Zhang/PhoenixLAB
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package co.phoenixlab.discord.api.endpoints.async;

import co.phoenixlab.discord.api.exceptions.ApiException;
import co.phoenixlab.discord.api.entities.PrivateChannel;
import co.phoenixlab.discord.api.entities.PublicChannel;
import co.phoenixlab.discord.api.request.CreateChannelRequest;
import co.phoenixlab.discord.api.request.CreatePrivateChannelRequest;
import co.phoenixlab.discord.api.request.EditChannelRequest;

import java.util.concurrent.Future;

public interface ChannelsEndpointAsync {

    Future<PublicChannel> createChannelAsync(long guildId, CreateChannelRequest request)
            throws ApiException;

    Future<PrivateChannel> createPrivateChannelAsync(long myUserId, CreatePrivateChannelRequest request)
            throws ApiException;

    Future<PublicChannel> editChannelAsync(long channelId, EditChannelRequest request)
            throws ApiException;

    Future<Void> deleteChannelAsync(long channelId)
            throws ApiException;

    Future<PublicChannel[]> getGuildChannelsAsync(long guildId)
            throws ApiException;

    Future<Void> broadcastTypingAsync(long channelId)
            throws ApiException;

}
