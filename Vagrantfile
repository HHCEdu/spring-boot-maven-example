# -*- mode: ruby -*-
# vi: set ft=ruby :
Vagrant.configure(2) do |config|
	config.vm.box = "ubuntu/xenial64"

	config.vm.define :node1 do |node1_config|
		node1_config.vm.network "private_network", ip:"192.168.56.31"
	end
end